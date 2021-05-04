package model.entrega;


public class Entrega {
    
    //#region Atributos
    private String codigoDeRastreio;
    private Date dataDeEntrega;
    private String tipoDeEnvio;
    private Cliente cliente;
    //#endregion

    //#region Construtores
    public Entrega(){}

    public Entrega(
        String codigoDeRastreio,
        String tipoDeEnvio,
        Cliente cliente
    ){
        this.codigoDeRastreio = codigoDeRastreio;
        this.tipoDeEnvio = tipoDeEnvio;
        this.cliente = cliente;
    }
    //#endregion

    public String getCodigoDeRastreio(){
        return this.codigoDeRastreio;
    }
    
    public void setCodigoDeRastreio(String codigoDeRastreio){
        this.codigoDeRastreio = codigoDeRastreio;
    }

    public String getDataDeEntrega(){
        return this.dataDeEntrega;
    }
    
    public void setDatadeEntrega(Date dataDeEntrega){
        this.dataDeEntrega = dataDeEntrega;
    }
    


}
