package main.java.br.com.nmanutencoes.model.itens;

public class Product {
    //#region Variaveis
    private int code;
    private String name;
    private String description;
    private Category category;
    private int amount;
    private Double value;
    private Double discount;
    //#endregion

    //#region Constructos

    public Product() {
    }

    public Product(int code, String name, String description, Category category, Double value, int amount) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
        this.amount = amount;
        this.value = value;
        this.discount = 0.00;
    }
    //#endregion

    //#region GETs & SETs

    public Product(int code, String description, Category category, Double value, Double discount, int amount) {
        this.code = code;
        this.description = description;
        this.category = category;
        this.amount = amount;
        this.value = value;
        this.discount = discount;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //#endregion
}
