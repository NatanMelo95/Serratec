package model.Cliente;

import model.endereco.Endereco;

public class Cliente {

    private Integer id;
    private String nome;
    private String telefone;
    private Endereco endereco;
    private Boolean logado;

    //#region Contrutores
    public Cliente(){}
    public Cliente( 
        Integer id, 
        String nome, 
        String telefone, 
        Endereco endereco
        ){

            this.id = id;
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;

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

    public Boolean getLogado(){
        return this.logado;
    }

    public void setLogado(Boolean logado){
        this.logado = logado;
    }

    


    //#endregion
    
    //#region Metodos

    //.....

    //#endregion
}
