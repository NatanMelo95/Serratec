public class Enterprise {
    //#region Variaveis
    private String name;
    private Adress adress;
    private Demand demand;
    //#endregion

    //#region Constructors
    public Enterprise(String name, Adress adress) {
        this.name = name;
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

    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Order getDemand() {
        return this.demand;
    }

    public void setDemand(Demand demand) {
        this.demand = demand;
    }
    //#endregion

    //#region methods
    public void PrintDemand(){
        System.out.println(""); 
        System.out.println("***************************************************************");  
        System.out.println("*********************** "+ this.name +" ***********************");  
        System.out.println("***************************************************************");  
        System.out.println(""); 

        var dataEHora = DataUtil.formatarDataPadraoDataEHora(new Date());
        System.out.println("Data e hora da geração: " + dataEHora);
        System.out.println("");
        System.out.println("Cliente");
        System.out.println("");
        System.out.println("_______________________________________________________________");
        System.out.println("Nome: " + this.demand.client.getNome());
        System.out.println("Rua: " + this.demand.client.adress.getStreet()+", "+ this.demand.client.adress.getNumber()+", Bairro: "+this.demand.client.adress.getDistrict());
        System.out.println("Referencia: " + this.demand.client.adress.getReference());
        System.out.println("");
        System.out.println("_______________________________________________________________");
        System.out.println("");
        System.out.println("Código    Nome     Quantidade    Valor Unitário     Valor total");

        for (i=0;i<this.demand.product.size();i++) {
            System.out.println(demand.FormatDemand());
        }
        System.out.println("");
        System.out.println("_______________________________________________________________");
        System.out.println(demand.FormatShipping());
        System.out.println("Desconto R$ " + this.demand.discount);
        System.out.println("Valor Total R$ " + this.demand.totalValueDis);
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");    
        System.out.println(""); 
    }
    //#endregion
}
