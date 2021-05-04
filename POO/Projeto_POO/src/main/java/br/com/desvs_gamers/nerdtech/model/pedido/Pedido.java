package model.pedido;

import java.util.ArrayList;
import model.cliente.Cliente;
import model.produto.Produto;

public class Pedido extends Produto{
    
    //#region Atributos
    private Integer id;
    private String descricao;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private Double valorTotal;
    private Boolean logado;
    private Double desconto;
    //#endregion
    
    //#region Construtores
    public Pedido(){} 
   
    public Pedido(
       Integer id,
       String descricao,
       Cliente cliente,
       Boolean logado,
       Double desconto ) {

        this.id = id;
        this.descricao = descricao;
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
        this.logado = logado;
        this.desconto = desconto;
        this.valorTotal = 0.0;
       
    }   
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

    public Boolean isLogado() {
        return this.logado;
    }

    public Boolean getLogado() {
        return this.logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }

    public Double getDesconto(){
        return desconto;
    }

    public double calcularValorTotal(){
        for (Produto produto : produtos){
        this.valorTotal += produto.getValorTotalProduto();
        }
        if (logado){
        return this.valorTotal = valorTotal*(1-(desconto/100));}
        else return this.valorTotal;
    }    
    //#endregion
    
    //#region Metodo
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    //#endregion

}

