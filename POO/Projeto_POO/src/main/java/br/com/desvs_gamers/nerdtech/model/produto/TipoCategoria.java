package model.produto;

public enum TipoCategoria {
    //#region Atributos
    FPS("FPS"),
    RPG("RPG"),
    ESPORTE("Esporte"),
    TERROR("Terror"),
    OPENWOLRD("Openworld"),
    ACAO("Ação");
    //#endregion

    private String valor;

    private TipoCategoria(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }    

}
