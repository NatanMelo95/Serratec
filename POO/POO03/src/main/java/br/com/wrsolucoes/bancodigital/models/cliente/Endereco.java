package models.cliente;

public class Endereco {
    //#region Atributos
    private String cep;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    //#endregion

    //#region Construtores
    public Endereco(){}

    public Endereco(String cep, String rua, int numero){
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco(String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado){
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    //#endregion

    //#region Getters e Setters
    public String getCep(){
        return this.cep;
    }

    public void setCep(String cep){
        // Verificar se o cep é valido
        this.cep = cep;
    }
    
    public String getRua(){
        return this.rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }  

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }  
        
    public String getComplemento(){
        return this.complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    } 
        
    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro){
        // validar no ibge
        this.bairro = bairro;
    } 
        
    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    } 

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    } 

    //#endregion

    //#region Metodos
    public String obterEnderecoCompleto(){
        return "Cep:" + this.cep + " - Rua ou Av:" + this.rua + " - N°" + this.numero;
        // CEP: 25.9805-32 - Rua ou Av: Rua das Amoras - N°87
    }

    //#endregion

    
}



