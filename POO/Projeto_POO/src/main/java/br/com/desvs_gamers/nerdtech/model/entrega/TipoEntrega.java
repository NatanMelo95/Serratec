package model.entrega;

public enum TipoEntrega {    
    LESMA("Lesma"),
    MEDIANA("Mediana"),
    FLASH("Flash"),
    BLINK("Blink"),
    QUERMESMORECEBER("Quere mesmo receber?");


    private String valor;

    private TipoEntrega(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
    
}

    

