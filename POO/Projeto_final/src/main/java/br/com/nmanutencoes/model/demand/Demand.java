package main.java.br.com.nmanutencoes.model.demand;

import java.util.ArrayList;
import java.util.Date;

import main.java.br.com.nmanutencoes.model.clients.Client;
import main.java.br.com.nmanutencoes.model.itens.Category;
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
    public Demand(int idOrder, Client client, Double discount, Payment payment) {
        this.idOrder = idOrder;
        this.date = new Date();
        this.product = new ArrayList<Product>();
        this.client = client;
        this.shipping = 0.00;
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

    public ArrayList<Product> getProduct() {
        return this.product;
    }

    public void setProduct(ArrayList<Product> product) {
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

    public Double getTotalValueDis() {
        return this.totalValueDis;
    }

    public void setTotalValueDis(Double totalValueDis) {
        this.totalValueDis = totalValueDis;
    }
    //#endregion

    //#region Methods
    public void AddProduct(String nm, int amount){
        int i;
        for (i=0;i<product.size();i++) {
            if(nm.equals(product.get(i).getName())){
                this.product.add(new Product(product.get(i).getCode(), product.get(i).getDescription(), product.get(i).getCategory(), product.get(i).getValue(), discount, amount));
                this.totalValue += product.get(i).getValue();
            }
        }
    }
    public Double CalcDemand(){
        int i;
        for(i=0;i<product.size();i++){
            if (this.payment != Payment.CREDITCARD) {
                discount = 0.05;
            }else{
                discount = 0.00;
            }
            this.discount += discount;
        }
        this.discount = this.discount/this.product.size();
        this.totalValueDis = this.totalValue - (this.totalValue*this.discount);
        return this.totalValueDis;
    }
    public Double CalcDemandDiscount(){
        int i;
        for(i=0;i<product.size();i++){
            if (this.payment != Payment.CREDITCARD) {
                discount = 0.05;
            }else{
                discount = 0.00;
            }
        }
        this.discount = this.discount/this.product.size();
        return this.discount;
    }
    public String FormatDemand(int i){
        var total = this.product.get(i).getAmount()*this.product.get(i).getValue();
        return String.format("%d    %s     %d    R$%.2f     R$%.2f", this.product.get(i).getCode(), this.product.get(i).getName(), this.product.get(i).getAmount(), this.product.get(i).getValue(), total);
    }
    public String FormatShipping(){
        Double shipping =0.00;
        int i;
        for(i=0;i<product.size();i++){
            if (this.product.get(i).getCategory() == Category.FREESHIPPING){
                shipping = 0.00;
            }else{
                shipping = 50.00;
                break;
            }
        }
        return String.format("Frete:     R$%.2f", shipping);
    }
    //#endregion
}
