package main.java.br.com.nmanutencoes.model.itens;

public enum Category {
    NATIONAL("Nacional"),
    IMPORTED("Importado"),
    PROMOTION("Promoção"),
    FREESHIPPING("Frete Gratis");

    private String type;

    private Category(String type){
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}