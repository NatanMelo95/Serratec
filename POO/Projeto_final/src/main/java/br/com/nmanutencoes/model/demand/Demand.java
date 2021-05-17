package main.java.br.com.nmanutencoes.model.orders;

import java.util.ArrayList;
import java.util.Date;

import main.java.br.com.nmanutencoes.model.clients.Client;
import main.java.br.com.nmanutencoes.model.itens.Product;

public class Demand {
    //#region Variaveiis
    private int idOrder;
    private Date date;
    private ArrayList<Product> product;
    private Client client;
    private Double shipping;
    private Double discount;
    private Payment payment;
    private Double totalValue;
    private Double totalValueDis;
    //#endregion

    //#region Constructors
    public Demand(int idOrder, Date date, Client client, Double shipping, Double discount, Payment payment) {
        this.idOrder = idOrder;
        this.date = date;
        this.product = new ArrayList<Product>();
        this.client = client;
        this.shipping = shipping;
        this.discount = 0.00;
        this.payment = payment;
        this.totalValue = 0.00;
    }
    //#endregion

    //#region GETs & SETs
    public int getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getShipping() {
        return this.shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Double getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    //#endregion

    //#region Methods
    public void AddProduct(String product, int amount){
        for (i=0;i<product.size();i++) {
            if(nm.equals(product.get(i).getNome())){
                if (this.payment != CREDITCARD) {
                    discount = 0.05;
                }else{
                    discount = 0.00;
                }
                this.product.add(new Product(Product.getCode(), Product.getDescription(), Product.getCategory(), Product.getValue(), discount, amount));
                this.totalValue += Product.getValue();
            }
        }
    }
    private Double CalcDemand(){
        for(i=0;product.size();i++){
            this.discount += this.product[i].discount;
        }
        this.discount = this.discount/this.product.size();
        this.totalValueDis = this.totalValue - (this.value*this.discount);
        return this.totalValueDis;
    }
    private Double CalcDemandDiscount(){
        for(i=0;product.size();i++){
            this.discount += this.product[i].discount;
        }
        this.discount = this.discount/this.product.size();
        return this.discount;
    }
    public String FormatDemand(){
        var total = this.product.getAmount()*this.product.getValue();
        return String.format("%d    %s     %d    R$%.2f     R$%.2f", this.product.getCode(), this.product.getName(), this.product.getAmount(), this.product.getValue(), total);
    }
    public String FormatShipping(){
        Double shipping;
        if (this.product.category == FREESHIPPING){
            shipping = 0.00;
        }else{
            shipping = 50.00;
        }
        return String.format("Frete:     R$%.2f", shipping);
    }
    //#endregion
}
