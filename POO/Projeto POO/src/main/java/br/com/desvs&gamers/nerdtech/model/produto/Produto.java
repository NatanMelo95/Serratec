package model.produto;

public class Produto {

    //#region Atributos
    private String descricao;
    private Double valorUnitario;
    private TipoCategoria categoria;
    private TipoPlataforma plataforma;
    private String observacao;
    private Double desconto;
    private Double valorTotal;
    private Integer quantidade;
    
    //#endregion

    //#region Construtores
    public Produto(){}

    public Produto(
        String descricao,
        Double valorUnitario,
        TipoCategoria categoria,
        TipoPlataforma plataforma,
        String observacao
         ){
             this.descricao = descricao;
             this.valorUnitario = valorUnitario;
             this.categoria = categoria;
             this.plataforma = plataforma;
             this.observacao = observacao;
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

    public void setValorUnitario(Double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    public TipoCategoria getCategoria(){
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria){
        this.categoria = categoria;
    }

    public TipoPlataforma getPlataforma(){
        return plataforma;
    }

    public void setPlataforma(TipoPlataforma plataforma){
        this.plataforma = plataforma;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    public Double getDesconto(){
        return desconto;
    }

    public void setDesconto(Double desconto){
        this.desconto = desconto;
    }
    
    public Double getValorTotal(){
        return valorTotal;
    }
    //#endregion
    //#region Métodos
    private void calcularValorTotal(){
        this.valorTotal = (this.quantidade * this.valorUnitario)*(1-this.desconto/100);
    }

    //#endregion
    
}
