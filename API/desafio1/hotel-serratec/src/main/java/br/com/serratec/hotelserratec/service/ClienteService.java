package br.com.serratec.hotelserratec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.hotelserratec.model.Cliente;
import br.com.serratec.hotelserratec.model.exception.ResourceBadRequestException;
import br.com.serratec.hotelserratec.model.exception.ResourceNotFoundException;
import br.com.serratec.hotelserratec.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository _repositoryCliente;
	
	public List<Cliente>obter(){
		return this._repositoryCliente.findAll();
	}
	public Optional<Cliente> obter(Long id){
		verifyIfExists(id);
		return this._repositoryCliente.findById(id);
	}
	public Cliente adicionar(Cliente cliente) {
		cliente.setId(null);
		verifyIfComplete(cliente);
		return this._repositoryCliente.save(cliente);
	}
	public Cliente alterar(Long id, Cliente cliente) {
		verifyIfExists(id);
		cliente.setId(id);
		return this._repositoryCliente.save(cliente);
	}
	
	public void deletar(Long id) {
		verifyIfExists(id);
		this._repositoryCliente.deleteById(id);
	}
	private void verifyIfExists(Long id) {
		Optional<Cliente> cliente = _repositoryCliente.findById(id);
		if (cliente==null) {
			throw new ResourceNotFoundException("Não foi encontrado cliente com ID: "+id);
		}
	}
	private void verifyIfComplete(Cliente cliente) {
		if (cliente.getNome()==null) {
			throw new ResourceBadRequestException("O campo Nome é obrigatório");
		}else if(cliente.getIdade()==null){
			throw new ResourceBadRequestException("O campo Idade é obrigatório");
		}else if(cliente.getCalular()==null){
			throw new ResourceBadRequestException("O campo Celular é obrigatório");
		}else if(cliente.getCpfOuCnpj()==null){
			throw new ResourceBadRequestException("O campo CPF ou CNPJ é obrigatório");
		}else if(cliente.getEmail()==null){
			throw new ResourceBadRequestException("O campo Email é obrigatório");
		}
	}
	
}
