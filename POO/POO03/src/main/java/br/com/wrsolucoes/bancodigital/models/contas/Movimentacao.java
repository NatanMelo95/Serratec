package models.contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimentacao {
   //#region Atributos
   private Date dataEHora;
   private TipoMovimentacao tipoMovimentacao;
   private double valor; 
   //#endregion

   //#region Construtor
    public Movimentacao(TipoMovimentacao tipo, double valor){
        this.dataEHora = new Date();
        this.tipoMovimentacao = tipo;
        this.valor = valor;
    }
   //#endregion

   public String obterMovimentacaoFormatada(){
        var formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        var dataFormatada = formatador.format(this.dataEHora);

        return dataFormatada + " (" + this.tipoMovimentacao.getTipo() + ")" + " R$" + this.valor;
        // 29/04/2021 13:51:52 (Saque) R$ 250.00

   }

}

