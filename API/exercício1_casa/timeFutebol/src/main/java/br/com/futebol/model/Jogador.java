package br.com.futebol.model;

public class Jogador {
	private Long id;
	private String nome;
	private Integer idade;
	private Double salario;
	
	
	public Jogador() {}

	public Jogador(String nome, Integer idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public Jogador(Long id, String nome, Integer idade, Double salario) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
