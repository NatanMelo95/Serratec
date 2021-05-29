package br.com.cadastrodev.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastrodev.model.Pessoa;
import br.com.cadastrodev.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	PessoaRepository _repositoryPessoa = new PessoaRepository();
	
	@GetMapping
	public List<Pessoa> obter(){
		return _repositoryPessoa.obter();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> adicionar(@RequestBody Pessoa pessoa){
		var pessoaAdicionada = _repositoryPessoa.adicionar(pessoa);
		return new ResponseEntity<>(pessoaAdicionada, HttpStatus.CREATED);
	}
	
}
