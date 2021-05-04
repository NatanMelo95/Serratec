

public class Cliente {
    Integer id;
    String nome;
    String celular;
    Endereco endereco;

    public Cliente(Integer id, String nome, String celular, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
    }

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

    public String getCelular(){
        return this.celular;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
