package main.java.br.com.nmanutencoes.model.clients;

public class Client {
    //#region variaveis
    private String name;
    private String email;
    private String phone;
    private String cpfOrCnpj;
    private Adress adress;
    //#endregion

    //#region Constructors
    public Client(String name, String email, String phone, String cpfOrCnpj, Adress adress) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cpfOrCnpj = cpfOrCnpj;
        this.adress = adress;
    }
    //#endregion

    //#region GETs & SETs
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpfOrCnpj() {
        return this.cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    //#endregion
}
