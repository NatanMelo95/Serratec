package main.java.br.com.uber.transporte.model.motorista;

import main.java.br.com.uber.transporte.model.pessoa.Pessoa;

public class Motorista extends Pessoa{
    //#region atributo
    private String tipoHabilitacao;
    //#endregion
    
    //#region get & set

    public String getTipoHabilitacao(){
        return this.tipoHabilitacao;
    }

    public void setTipoHabilitacao(String tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }
    //#endregion

    //#region methods
    public Motorista() {    
    }
    //#endregion
}
