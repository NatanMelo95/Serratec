package model.produto;

public class Produto {

    //#region Atributos
    private String descricao;
    private Double valorUnitario;
    private TipoCategoria categoria;
    private TipoPlataforma plataforma;
    private String observacao;
    private Double valorTotalProduto;
    private Integer quantidade;    
    //#endregion

    //#region Construtores
    public Produto(){}

    public Produto(
        String descricao,
        Double valorUnitario,
        TipoCategoria categoria,
        TipoPlataforma plataforma,
        Integer quantidade,
        String observacao
         ){
                this.descricao = descricao;
                this.valorUnitario = valorUnitario;
                this.categoria = categoria;
                this.plataforma = plataforma;
                this.observacao = observacao;
                this.quantidade = quantidade;
                this.calcularValorTotal();
         }
    //#endregion

    //#region Gets e Sets
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Double getValorUnitario(){
        return valorUnitario;
    }

    public TipoCategoria getCategoria(){
        return categoria;
    }

    public TipoPlataforma getPlataforma(){
        return plataforma;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    public Double getValorTotalProduto(){        
        return this.valorTotalProduto;
    }
    //#endregion
    
    //#region Métodos
    private void calcularValorTotal(){
        this.valorTotalProduto = (this.quantidade * this.valorUnitario);
    }

    @Override
    public String toString(){
        return "\n" +
        "\nNome: " + this.descricao 
        + "\nValor: " + this.valorUnitario 
        + "\nCategoria: " + this.categoria 
        + "\nPlataforma: " + this.plataforma
        + "\nQuantidade: " + this.quantidade
        + "\nObservação: " + this.observacao;
    }

    //#endregion
    
}
