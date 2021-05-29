package br.com.serratec.padaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.padaria.model.Produto;
import br.com.serratec.padaria.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository _repositoryProduto;
	
	@GetMapping
	public List<Produto> obter(){
		return this._repositoryProduto.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> obter(@PathVariable("id") Long id){
		return this._repositoryProduto.findById(id);
	}
	
	@PostMapping
	public Produto adicionar(@RequestBody Produto produto) {
		return this._repositoryProduto.save(produto);
	}
	
	@PutMapping("/{id}")
	public Produto adicionar(@PathVariable("id") Long id, @RequestBody Produto produto) {
		produto.setId(id);
		return this._repositoryProduto.save(produto);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		this._repositoryProduto.deleteById(id);
	}
}