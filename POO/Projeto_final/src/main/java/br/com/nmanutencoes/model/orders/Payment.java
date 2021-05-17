package main.java.br.com.nmanutencoes.model.orders;

public enum Payment {
    CREDITCARD("Cartão de crédito"),
    DEBITCARD("Cartão de débito"),
    PIX("Pix"),
    PICPAY("PicPay"),
    TICKET("Boleto");

    private String type;

    private Payment(String type){
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}
