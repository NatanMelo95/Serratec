package src.main.java.br.com.turmadosferas.lanchonete.model.produto;

public enum TipoProduto {
    SANDUICHE("Sanduiches"),
    SALGADOS("Salgados"),
    PIZZAS("Pizzas"),
    BEBIDAS("Bebidas"),
    DOCES("Doces");

    private String valor;

    TipoProduto(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
}
