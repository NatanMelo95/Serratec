package br.com.serratec.padaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@Api(value = "API REST Produtos")
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository _repositoryProduto;
	
	@ApiOperation(value = "Retorna lista de produtos")
	@GetMapping
	public List<Produto> obter(){
		return this._repositoryProduto.findAll();
	}
	
	@ApiOperation(value = "Retorna produto por Id")
	@GetMapping("/{id}")
	public Optional<Produto> obter(@PathVariable("id") Long id){
		return this._repositoryProduto.findById(id);
	}
	
	@ApiOperation(value = "Adiciona produto")
	@PostMapping
	public Produto adicionar(@RequestBody Produto produto) {
		return this._repositoryProduto.save(produto);
	}
	
	@ApiOperation(value = "Atualiza produto")
	@PutMapping("/{id}")
	public Produto adicionar(@PathVariable("id") Long id, @RequestBody Produto produto) {
		produto.setId(id);
		return this._repositoryProduto.save(produto);
	}
	
	@ApiOperation(value = "Deleta produto")
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		this._repositoryProduto.deleteById(id);
	}
}