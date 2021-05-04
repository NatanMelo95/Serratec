package main.java.br.com.calculaimc.imc.model.usuario;

public class Usuario {
    //#region atributs
    private int peso;
    private String nome;
    private int altura;
    private int idade;
    private String sexo;
    //#endregion

    //#region constructors
    public Usuario() {
        
    }

    public Usuario(int peso, String nome,
    int altura,
    int idade,
    String sexo) {
        this.peso = peso;
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
    }
    //#endregion

    //#region gets & sets
    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //#endregion

    //#region methods
    public String ImcCalculator() {
        String msg;
        double imc = this.peso / (this.altura * this.altura);
        if (imc<18.5) {
            msg = "O IMC do usuário " + this.getNome() + " é " + imc + " Abaixo do peso";
        } else if(imc>18.5 || imc < 24.9){
            msg = "O IMC do usuário " + this.getNome() + " é " + imc + " Peso normal";
        } else if(imc>24.9 || imc < 29.9){
            msg = "O IMC do usuário " + this.getNome() + " é " + imc + " Sobrepeso";
        } else if(imc>29.9 || imc < 34.9){
            msg = "O IMC do usuário " + this.getNome() + " é " + imc + " Obesidade I";
        } else if(imc>34.9 || imc < 39.9){
            msg = "O IMC do usuário " + this.getNome() + " é " + imc + " Obesidade II";
        } else {
            msg = "O IMC do usuário " + this.getNome() + " é " + imc + " Morbida";
        }
        return msg;
    }
    //#endregion
}
