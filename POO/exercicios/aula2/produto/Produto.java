public class Produto{

    public String nome;
    public double valorUnitario;
    public int quantidade;
    public double acressimo;
    public double desconto;
    private double valorTotal;
    public Date validade;

    public Produto(){};

    public Produto(String nome,double valorUnitario, int quantidade, Date validade){
        this.nome = nome;
        this.valorUnitario = valorUnitario;    
        this.quantidade = quantidade;
        this.validade = validade;
    };

    public double getValotTotal(){
        return this.valorTotal;
    };
    public void Calcular(){
        if (this.validade <= Date.now()){
            this.desconto = (this.valorUnitario * this.quantidade) * 0.15
            this.acressimo = 0
        }else{
            this.desconto = 0
            this.acressimo = (this.valorUnitario * this.quantidade) * 0.05
        }
        this.valorTotal = (this.valorUnitario * this.quantidade) + this.acressimo - this.desconto;
    }
}