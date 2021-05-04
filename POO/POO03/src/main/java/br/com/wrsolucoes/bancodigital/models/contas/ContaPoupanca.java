package models.contas;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(
        String agencia, 
        String numero, 
        int digitoDaConta, 
        double saldoInicial) {
        super(agencia, numero, digitoDaConta, saldoInicial);
    }
    
}
