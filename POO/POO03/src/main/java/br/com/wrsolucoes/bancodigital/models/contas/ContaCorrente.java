package models.contas;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(
        String agencia, 
        String numero, 
        int digitoDaConta, 
        double saldoInicial) {
        super(agencia, numero, digitoDaConta, saldoInicial);
    }

    
}
