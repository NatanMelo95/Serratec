package br.com.carro.autocenter.model;

public class Carro {
    private Long id;
    private String nome;
    private String modelo;
    private Integer ano;


    public Carro() {
    }

    public Carro(String nome, String modelo, Integer ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(Long id, String nome, String modelo, Integer ano) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

}
