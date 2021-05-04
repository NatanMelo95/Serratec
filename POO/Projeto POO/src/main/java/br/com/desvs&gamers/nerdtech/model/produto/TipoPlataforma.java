package model.produto;

public enum TipoPlataforma {
    COMPUTADOR("Computador"),
    PLASTATION5("Plastation 5"),
    XBOX("Xbox serie x"),
    NINTENDODS("Nintendo DS");

    private String valor;

    private TipoPlataforma(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
    
}