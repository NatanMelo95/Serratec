

public class Endereco {
    String rua;
    Integer numero;
    String bairro;
    String complemento;

    public Endereco(String rua, Integer numero, String bairro, String complemento){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public String getRua(){
        return this.rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getComplemento(){
        return this.complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String obterEnderecoCompleto(){
        return "Rua:" + this.rua + " Numero:" + this.numero + " Bairro:" + this.bairro;
    }
}