package models.contas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public class ContaBancaria {
    //#region Atributos
    protected String agencia;
    protected String numero;
    protected int digitoDaConta;
    protected double saldo;
    protected ArrayList<Movimentacao> movimentacoes;
    //#endregion

    //#region Construtores
    public ContaBancaria(String agencia, String numero, int digitoDaConta, double saldoInicial){
        this.agencia = agencia;
        this.numero = numero;
        this.digitoDaConta = digitoDaConta;
        this.saldo = saldoInicial;

        // Iniciando nosso array de movimentações
        this.movimentacoes = new ArrayList<Movimentacao>();

        // Adicionando nossa primeira movimentação
        this.movimentacoes.add(new Movimentacao(TipoMovimentacao.ABERTURA, saldoInicial));

    }
    //#endregion


    //#region Getters Setters
    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public int getDigitoDaConta(){
        return this.digitoDaConta;
    }

    public void setDigitoDaConta(int digito){
        this.digitoDaConta = digito;
    }

    public double getSaldo(){
        return this.saldo;
    }


    //#endregion

    //#region metodos

    public double sacar(double valor){

        if(this.saldo < valor) {
           throw new InputMismatchException("Saldo insuficiente."); 
        }

        // this.saldo = this.saldo - valor;
        this.saldo -= valor;
        this.movimentacoes.add(new Movimentacao(TipoMovimentacao.SAQUE, valor));

        return valor;
    }

    public void depositar(double valor){
        // Regra de negocio, só posso ter valor maior que 10,00
        if(valor < 10){
            throw new InputMismatchException("Valor minimo para deposito é R$ 10.00");
        }
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
        this.movimentacoes.add(new Movimentacao(TipoMovimentacao.DEPOSITO, valor));
    }


    public void imprimirExtrato(){
        System.out.println("************************************");
        System.out.println("********* Extrato Bancario *********");
        System.out.println("************************************");
      
        var formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("Gerado em: " + formatador.format(new Date()));
        System.out.println("");

        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println(movimentacao.obterMovimentacaoFormatada());
        }  
        System.out.println("Saldo de R$" + this.saldo);  

        System.out.println("");
        System.out.println("");

    }

    //#endregion
}
