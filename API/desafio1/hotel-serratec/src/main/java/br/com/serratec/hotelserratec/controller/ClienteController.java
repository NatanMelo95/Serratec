package br.com.serratec.hotelserratec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.hotelserratec.model.Cliente;
import br.com.serratec.hotelserratec.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@Api(value = "API REST Clientes")
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService _serviceCliente;
	
	@ApiOperation(value = "Retorna todos os cliente")
	@GetMapping
	public List<Cliente> obter(){
		return _serviceCliente.obter();
	}
	
	@ApiOperation(value = "Retorna o cliente por ID")
	@GetMapping("/{id}")
	public Optional<Cliente> obter(@PathVariable("id") Long id){
		return _serviceCliente.obter(id);
	}
		
	@ApiOperation(value = "Adiciona o cliente")
	@PostMapping
	public Cliente adicionar(@Validated @RequestBody Cliente cliente) {
		return _serviceCliente.adicionar(cliente);
	}
	
	@ApiOperation(value = "Altera dados do cliente")
	@PutMapping("/{id}")
	public Cliente alterar(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
		return this._serviceCliente.alterar(id, cliente);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		this._serviceCliente.deletar(id);
	}
}
