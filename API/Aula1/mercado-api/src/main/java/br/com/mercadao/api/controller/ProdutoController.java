package br.com.mercadao.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.mercadao.api.model.Produto;
import br.com.mercadao.api.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	private ProdutoRepository repositorioDeProdutos= new ProdutoRepository();
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public List<Produto> obterTudo(){
		return this.repositorioDeProdutos.obter();
	}
	@RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
	public Optional<Produto> obterTudo(@PathVariable(value = "id") Integer id){
		return this.repositorioDeProdutos.obter(id);
	}
	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	public Produto adicionar(Produto produto) {
		return this.repositorioDeProdutos.adicionar(produto);
	}
}
