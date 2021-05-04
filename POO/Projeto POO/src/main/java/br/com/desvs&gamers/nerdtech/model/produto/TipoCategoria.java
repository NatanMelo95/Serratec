package model.produto;


public enum TipoCategoria {
    FPS("FPS"),
    RPG("RPG"),
    ESPORTE("Esporte"),
    TERROR("Terror"),
    OPENWOLRD("Openworld"),
    ACAO("Ação");


    private String valor;

    private TipoCategoria(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
    
}
