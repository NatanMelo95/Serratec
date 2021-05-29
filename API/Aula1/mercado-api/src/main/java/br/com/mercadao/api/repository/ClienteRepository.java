package br.com.mercadao.api.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.mercadao.api.model.Cliente;

public class ClienteRepository {
	private ArrayList<Cliente>clientes;
	private Long idAtual = 0L;
	
	public ClienteRepository() {
		this.clientes = new ArrayList<Cliente>();
	}
	public List<Cliente>obter(){
		return this.clientes;
	}
	
	public Cliente adicionar(Cliente cliente) {
		this.idAtual++;
		cliente.setId(idAtual);
		this.clientes.add(cliente);
		return cliente;
	}
}
