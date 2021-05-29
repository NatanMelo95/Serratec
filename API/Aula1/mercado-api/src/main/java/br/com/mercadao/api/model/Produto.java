package br.com.mercadao.api.model;

public class Produto {
	private Integer id;
	private String nome;
	private Integer quantidade;
	private Double valor;
	public Produto() {}
	public Produto(Integer id, String nome, Integer quantidade, Double valor) {
		this.id=id;
		this.nome=nome;
		this.quantidade=quantidade;
		this.valor=valor;
	}
	public Produto(String nome, Integer quantidade, Double valor) {
		this.nome=nome;
		this.quantidade=quantidade;
		this.valor=valor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
