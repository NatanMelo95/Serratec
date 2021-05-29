package br.com.cadastrodev.model;

public class Pessoa {
	private Integer id;
	private String nome;
	private Integer idade;
	private boolean dev;
	
	public Pessoa() {}
	
	public Pessoa(String nome, Integer idade, boolean dev) {
		this.nome=nome;
		this.idade=idade;
		this.dev=dev;
	}
	
	public Pessoa(Integer id, String nome, Integer idade, boolean dev) {
		this.id=id;
		this.nome=nome;
		this.idade=idade;
		this.dev=dev;
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public boolean isDev() {
		return dev;
	}
	public void setDev(boolean dev) {
		this.dev = dev;
	}
	
	
}
