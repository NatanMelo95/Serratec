public class Produto{

    public String nome;
    public double valorUnitario;
    public int quantidade;
    public double acressimo;
    public double desconto;
    private double valorTotal;
    public Date validade;

    public Produto(){};

    public Produto(String nome,double valorUnitario, int quantidade){
        this.nome = nome;
        this.valorUnitario = valorUnitario;    
        this.quantidade = quantidade;
    };

    public double getValotTotal(){
        return this.valorTotal;
    };
    public void Calcular(){
        this.valorTotal = (this.valorUnitario * this.quantidade) + this.acressimo - this.desconto;
    }
}