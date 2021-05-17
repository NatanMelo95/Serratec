package main.java.br.com.nmanutencoes.model.itens;

public class Product {
    //#region Variaveis
    private String code;
    private String description;
    private Category category;
    private int amount;
    private Double value;
    private Double discount;
    //#endregion

    //#region Constructos
    public Product(String code, String description, Category category, int amount, Double value, Double discount) {
        this.code = code;
        this.description = description;
        this.category = category;
        this.amount = amount;
        this.value = value;
        this.discount = discount;
    }
    //#endregion

    //#region GETs & SETs

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
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
    //#endregion
}
