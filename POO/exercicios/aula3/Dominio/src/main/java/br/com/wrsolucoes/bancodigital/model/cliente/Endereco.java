package main.java.br.com.wrsolucoes.bancodigital.model.cliente;

public class Endereco {
    //#region atributos
    private String cep;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    //#endregion

    //#region constructors
    public Endereco(
        String cep,
        String rua,
        int numero,
        String complemento,
        String bairro,
        String estado) {
        this.cep;
        this.rua;
        this.numero;
        this.complemento;
        this.bairro;
        this.estado;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //#endregion

    //#region methods
    public String getEnderecoCompleto() {
        return "Cep" + this.cep + "Rua ou Av:" + this.rua + "- N" + this.numero;
    }
    //#endregion

}
