package br.com.mercadao.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadao.api.model.Cliente;
import br.com.mercadao.api.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	private ClienteRepository _repositoryCliente = new ClienteRepository();
	
	@GetMapping
	public List<Cliente> obter(){
		return _repositoryCliente.obter();
	}
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return _repositoryCliente.adicionar(cliente);
	}
}
