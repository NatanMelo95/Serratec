package models.contas;

public enum TipoMovimentacao {
    SAQUE("Saque"),
    DEPOSITO("Deposito"),
    ABERTURA("Abertura de conta"),
    TRANSFERENCIA("Transferência"),
    RENDIMENTOS("Rendimentos");

    private String tipo;

    private TipoMovimentacao(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
