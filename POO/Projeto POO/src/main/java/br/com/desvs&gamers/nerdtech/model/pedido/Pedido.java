package model.pedido;

import java.util.ArrayList;

import model.cliente.Cliente;
import model.produto.Produto;

public class Pedido {
    
    //#region Atributos
    private Integer id;
    private String descricao;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private Double valorTotal;
    private String rastreio;
    private Boolean logado;
    //#endregion
    
    //#region Gets e Sets
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getRastreio() {
        return this.rastreio;
    }

    public void setRastreio(String rastreio) {
        this.rastreio = rastreio;
    }

    public Boolean isLogado() {
        return this.logado;
    }

    public Boolean getLogado() {
        return this.logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }
    //#endregion

   //#region Construtores
   //#endregion 

    
}

