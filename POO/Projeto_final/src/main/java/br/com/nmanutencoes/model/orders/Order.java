package main.java.br.com.nmanutencoes.model.orders;

import java.util.Date;

import main.java.br.com.nmanutencoes.model.clients.Client;
import main.java.br.com.nmanutencoes.model.itens.Product;

public class Order {
    //#region Variaveiis
    private int idOrder;
    private Date date;
    private Product product;
    private Client client;
    private Double shipping;
    private Double discount;
    private Payment payment;
    private Double totalValue;
    //#endregion

    //#region Constructors
    public Order(int idOrder, Date date, Product product, Client client, Double shipping, Double discount, Payment payment, Double totalValue) {
        this.idOrder = idOrder;
        this.date = date;
        this.product = product;
        this.client = client;
        this.shipping = shipping;
        this.discount = discount;
        this.payment = payment;
        this.totalValue = totalValue;
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
}
