package src.main.java.br.com.turmadosferas.lanchonete.model.produto;

public class Produto {
    Integer id;
    String descricao;
    TipoProduto categoria;
    Integer quantidade;
    Double valorUnitario;
    Double desconto; // Sempre por valor no nosso exemplo.
    Double valorTotal;
    String observacao;

    public Produto(
        Integer id,
        String descricao,
        TipoProduto categoria,
        Integer quantidade,
        Double valorUnitario,
        Double desconto,
        String observacao){

        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;
        this.observacao = observacao;
        
        this.calcularValorTotal();
    }

    //#region Getters e Setters
    public Integer getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public TipoProduto getCategoria(){
        return this.categoria;
    }

    public void setCategoria(TipoProduto categoria){
        this.categoria = categoria;
    }

    public Integer getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
        this.calcularValorTotal();
    }

    public Double getValorUnitario(){
        return this.valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario){
        this.valorUnitario = valorUnitario;
        this.calcularValorTotal();
    }

    public Double getDesconto(){
        return this.desconto;
    }

    public void setDesconto(Double desconto){
        this.desconto = desconto;
        this.calcularValorTotal();
    }
    
    public String getObservacao(){
        return this.observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public Double getValorTotal(){
        return this.valorTotal;
    }
    //#endregion

    //#region Metodos
    private void calcularValorTotal(){
        this.valorTotal = (this.quantidade * this.valorUnitario) - this.desconto;
    }
    //#endregion
}
