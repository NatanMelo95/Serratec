package main.java.br.com.nmanutencoes.model.clients;

public class Adress {
    //cep, rua, numero, bairro, cidade, complemento, referencia
    //#region Variaveis
    private String zip;
    private String street;
    private int number;
    private String district;
    private String town;
    private String complement;
    private String reference;
    //#endregion

    //#region Constructor
    public Adress(String zip, String street, int number, String district, String town, String complement, String reference) {
        this.zip = zip;
        this.street = street;
        this.number = number;
        this.district = district;
        this.town = town;
        this.complement = complement;
        this.reference = reference;
    }
    //#endregion

    //#region GETs & SETs
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    //#endregion
}