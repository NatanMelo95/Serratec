package br.com.carro.autocenter.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carro.autocenter.model.Carro;
import br.com.carro.autocenter.repository.CarroRepository;

@RestController
@RequestMapping("/api/carro")
public class CarroController {
    CarroRepository _repositoryCarro = new CarroRepository();
	
	@GetMapping
	public List<Carro> obter(){
		return _repositoryCarro.obter();
	}
	
	@PostMapping
	public ResponseEntity<Carro> adicionar(@RequestBody Carro carro){
		var carroAdicionada = _repositoryCarro.adicionar(carro);
		return new ResponseEntity<>(carroAdicionada, HttpStatus.CREATED);
	}
}
