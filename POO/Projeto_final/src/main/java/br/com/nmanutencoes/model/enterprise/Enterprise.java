public class Enterprise {
    //#region Variaveis
    private String name;
    private Adress adress;
    private Order order;
    //#endregion

    //#region Constructors
    public Enterprise(String name, Adress adress, Order order) {
        this.name = name;
        this.adress = adress;
        this.order = order;
    }
    //#endregion

    //#region GETs & SETs
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    //#endregion
}
