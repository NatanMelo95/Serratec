package model.endereco;

public class Endereco {
    
    //#region Atributos
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    //#endregion
    
    //#region construtoes
    public Endereco(){}

    public Endereco(
        String rua, 
        String bairro, 
        String cidade, 
        String estado){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    //#endregion
    
    //#region Getters e Settes
    public String getRua(){
        return this.rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    //#endregion

    //#region Metodo
    @Override
    public String toString() {
        return "Rua: " + this.rua + " Bairro: " + this.bairro + " Cidade: " + this.cidade + " Estado: " + this.estado;
    }
    //#endregion
}
