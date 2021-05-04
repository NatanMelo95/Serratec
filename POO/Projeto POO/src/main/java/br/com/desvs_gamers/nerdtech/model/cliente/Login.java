package model.cliente;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Login extends Cliente {

    private String usuario;
    private String senha;
    private Date dataCriacao;

    //#region construtores
    public Login (){};
    public Login ( 
        String usuario,
        String senha,
        Cliente cliente
    ){
        this.usuario = usuario;
        this.senha = senha;
        this.dataCriacao = new Date();
    }
    //#endregion
   
    //#region get e set
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String setSenha() {
        return this.senha;
    }
    
    public String getCliente() {
        return this.usuario;
    }    
    //#endregion

    //#region métodos
    public String getDataCriacao() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return formatador.format(dataCriacao);
    }
    //#endregion
}