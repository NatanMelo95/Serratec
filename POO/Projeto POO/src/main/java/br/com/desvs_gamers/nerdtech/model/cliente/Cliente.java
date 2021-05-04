package model.cliente;

import model.endereco.Endereco;

public class Cliente {
    //#region Atributes
    private Integer id;
    private String nome;
    private String telefone;
    private Endereco endereco;
    private Integer idade;
    //#endregion

    //#region Contrutores
    public Cliente(){}
    public Cliente( 
        Integer id, 
        String nome, 
        String telefone, 
        Endereco endereco,
        Integer idade
        ){

            this.id = id;
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.idade = idade;

        }
    //#endregion

    //#region gets e sets
    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }
    //#endregion
    
    //#region Metodos
    @Override
    public String toString(){
    return this.nome + " - " + this.endereco + " - " + this.telefone +"\n";   
    }
    //#endregion

}

