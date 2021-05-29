package br.com.futebol.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.futebol.exception.JogadorNaoEncontradoException;
import br.com.futebol.model.Jogador;

public class JogadorRepository {
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private Long idAtual = 0L;
	
	public JogadorRepository() {}
	public List<Jogador> obter(){
		return this.jogadores;
	}
	public Optional<Jogador> obter(Long id){
		return this.jogadores.stream()
				.filter(j->j.getId()==id)
				.findFirst();
	}
	public Jogador adicionar(Jogador jogador) {
		this.idAtual++;
		jogador.setId(idAtual);
		this.jogadores.add(jogador);
		return jogador;
	}
	public Jogador atualizar(Jogador jogadorAtualizado) throws JogadorNaoEncontradoException {
		this.removerDaLista(jogadorAtualizado.getId());
		this.jogadores.add(jogadorAtualizado);
		return jogadorAtualizado;
	}
	private void removerDaLista(Long id) throws JogadorNaoEncontradoException {
		var jogador = this.obter(id);
		
		if(jogador.isEmpty()) {
			throw new JogadorNaoEncontradoException();
		}
		this.jogadores.removeIf(j -> j.getId()==id);
	}
	public Optional<Jogador>remover(Long id) throws JogadorNaoEncontradoException{
		var jogador = this.obter(id);
		this.removerDaLista(id);
		return jogador;
	}
}
