package br.com.cadastrodev.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.cadastrodev.model.Pessoa;

public class PessoaRepository {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private Integer idAtual = 0;
	
	public PessoaRepository() {}
	public List<Pessoa> obter(){
		return this.pessoas;
	}
	public Pessoa adicionar(Pessoa pessoa) {
		idAtual++;
		pessoa.setId(idAtual);
		this.pessoas.add(pessoa);
		return pessoa;
	}
}
