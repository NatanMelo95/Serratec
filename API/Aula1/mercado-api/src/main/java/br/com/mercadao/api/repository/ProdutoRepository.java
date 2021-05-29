package br.com.mercadao.api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.mercadao.api.model.Produto;

public class ProdutoRepository {
	private ArrayList<Produto> listaDeProdutos;
	private Integer ultimoId = 1;
	public ProdutoRepository() {
		this.listaDeProdutos = new ArrayList<Produto>();
		this.listaDeProdutos.add(new Produto(1, "Celular Android", 10, 200.00));
	}
	public List<Produto> obter(){
		return this.listaDeProdutos;
	}
	public Optional<Produto> obter(Integer id){
		return this.listaDeProdutos.stream()
				.filter(p->p.getId()==id)
				.findFirst();
	}
	public Produto adicionar(Produto produto) {
		this.ultimoId++;
		produto.setId(ultimoId);
		this.listaDeProdutos.add(produto);
		return produto;
	}
}
