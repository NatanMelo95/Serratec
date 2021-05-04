package model.entrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.cliente.Cliente;

public class Entrega {
    
    //#region Atributos
    private String codigoDeRastreio;
    private LocalDate dataDeEntrega;
    private Cliente cliente;
    private TipoEntrega tipoDeEntrega;
    //#endregion

    //#region Construtores
    public Entrega(){}
    public Entrega(
        String codigoDeRastreio,
        Cliente cliente,
        TipoEntrega tipoDeEntrega
    ){
        this.codigoDeRastreio = codigoDeRastreio;
        this.cliente = cliente;
        this.dataDeEntrega = LocalDate.now().plusDays(5);
        this.tipoDeEntrega = tipoDeEntrega;
    }
    //#endregion

    //#region Gets e Sets
    public String getCodigoDeRastreio(){
        return this.codigoDeRastreio;
    }
    
    public void setCodigoDeRastreio(String codigoDeRastreio){
        this.codigoDeRastreio = codigoDeRastreio;
    }

    public LocalDate getDataDeEntrega(){
        return this.dataDeEntrega;
    }
    
    public void setDatadeEntrega(LocalDate dataDeEntrega){
        this.dataDeEntrega = dataDeEntrega;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }

    public Cliente setCliente(){
        return this.cliente;
    }

    public TipoEntrega getTipoDeEntrega(){
        return this.tipoDeEntrega;
    }
    //#endregion

    //#region Metodos
    private String formatadorData(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataDeEntrega.format(formatador);
        return dataFormatada;
    }
    public String previsaoDeEntrega(){

        return "\n" +
        cliente.getNome() + "-->  "
        + "\nCodigo de Rastreio: " + this.codigoDeRastreio 
        + "\nEntrega: " + formatadorData() 
        + "\nForma de envio: " + this.tipoDeEntrega;
    }
    //#endregion

}
