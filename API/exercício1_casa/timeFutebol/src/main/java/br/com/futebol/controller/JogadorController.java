package br.com.futebol.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.futebol.exception.JogadorNaoEncontradoException;
import br.com.futebol.model.Jogador;
import br.com.futebol.repository.JogadorRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@Api(value = "API REST Jogadores")
@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {
	JogadorRepository _repositoryJogador = new JogadorRepository();
	
	@ApiOperation(value = "Retorna uma lista de jogadores")
	@GetMapping
	public List<Jogador> obter(){
		return _repositoryJogador.obter();
	}
	
	@ApiOperation(value = "Retorna um jogador por Id")
	@GetMapping("/{id}")
	public ResponseEntity<Jogador> obter(@PathVariable("id") long id) {
	    Optional<Jogador> obterJogador = _repositoryJogador.obter(id);

	    if (obterJogador.isPresent()) {
	     	return new ResponseEntity<>(obterJogador.get(), HttpStatus.OK);
	    } else {
	      	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
	@ApiOperation(value = "Adiciona um jogador")
	@PostMapping
	public ResponseEntity<Jogador> adicionar(@RequestBody Jogador jogador){
		var jogadorAdicionado = _repositoryJogador.adicionar(jogador);
		return new ResponseEntity<>(jogadorAdicionado, HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Atualiza um jogador")
	@PutMapping("/{id}")
	public ResponseEntity<Jogador> atualizar(@PathVariable(value = "id") long id, @RequestBody Jogador jogador) {
	    try {
	    	jogador.setId(id);
	    	var jogadorAtualizado = _repositoryJogador.atualizar(jogador);
	    	return new ResponseEntity<>(jogadorAtualizado, HttpStatus.OK);
	    } catch (JogadorNaoEncontradoException e){
	    	return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	    }
	}

	@ApiOperation(value = "Deleta um jogador")
	@DeleteMapping("/{id}")
	public ResponseEntity<Optional<Jogador>> remover(@PathVariable(value = "id") long id) {
		try {
	      var jogadorRemovido = _repositoryJogador.remover(id);
	      return new ResponseEntity<Optional<Jogador>>(jogadorRemovido, HttpStatus.OK);
	    } catch (JogadorNaoEncontradoException e) {
	      return new ResponseEntity<Optional<Jogador>>(HttpStatus.NOT_FOUND);
	    }
	}
}
