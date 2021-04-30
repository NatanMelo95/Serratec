package main.java.br.com.uber.transporte.model.pessoa;

public class Pessoa {
    //#region atributos
    private String nome;
    private int idade;
    private String telefone;
    //#endregion

    //#region get & set

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //#endregion

    //#region methods
    public String comprimentar(){
        String mensagem = "Olá, me chamo: " + nome;
        return mensagem;
    }
}
