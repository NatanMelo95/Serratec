package models.cliente;

import models.contas.ContaBancaria;

public class Cliente {
    //#region Atributos
    private String nome;
    private String cpfOuCnpj;
    private String rg;
    private String email;
    private String celular;
    private Endereco endereco;
    private ContaBancaria contaBancaria;

    //#endregion

    //#region Construtores

    public Cliente(){}

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(
        String nome, 
        String cpfOuCnpj, 
        String rg, 
        String email, 
        String celular,
        Endereco endereco){

        this.nome = nome;
        this.cpfOuCnpj = cpfOuCnpj;
        this.rg = rg;
        this.email = email;
        this.celular = celular;
        this.endereco = endereco; 
    }

    //#endregion

    //#region gets
    public String getNome(){
        return this.nome;
    }

    public String getCpfOuCnpj(){
        return this.cpfOuCnpj;
    }

    public String getRg(){
        return this.rg;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCelular(){
        return this.celular;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    //#endregion

    //#region sets

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpfOuCnpj(String cpfOuCnpj){
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    //#endregion


    
}
