package br.com.carro.autocenter.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.carro.autocenter.model.Carro;

public class CarroRepository {
    private ArrayList<Carro> carros = new ArrayList<Carro>();
	private Long idAtual = 0L;
	
	public CarroRepository() {}
	public List<Carro> obter(){
		return this.carros;
	}
	public Carro adicionar(Carro carro) {
		idAtual++;
		carro.setId(idAtual);
		this.carros.add(carro);
		return carro;
	}
}
