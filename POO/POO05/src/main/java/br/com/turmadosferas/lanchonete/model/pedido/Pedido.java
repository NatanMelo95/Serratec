package src.main.java.br.com.turmadosferas.lanchonete.model.pedido;

import java.util.ArrayList;
import src.main.java.br.com.turmadosferas.lanchonete.model.cliente.Cliente;
import src.main.java.br.com.turmadosferas.lanchonete.model.produto.Produto;

public class Pedido {
    Integer id;
    String descricao;
    Cliente cliente;
    ArrayList<Produto> produtos;
    Double valorTotal;

    //#region construtores
    public Pedido(
        Integer id, 
        String descricao, 
        Cliente cliente, 
        ArrayList<Produto> produtos){
        this.id = id;
        this.descricao = descricao;
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = 0.0;
    }

    public Pedido(
        Integer id, 
        String descricao, 
        Cliente cliente){
        this.id = id;
        this.descricao = descricao;
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
        this.valorTotal = 0.0;
    }
    //#endregion

    //#region Construtor
    public Integer getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos(){
        return this.produtos;
    }
    //#endregion

    //#region Metodos
    public void excluirTodosOsProdutos(){
        this.produtos.clear();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public double calcularValorTotal(){

        for (Produto produto : produtos) {
            this.valorTotal += produto.getValorTotal();
        }

        return this.valorTotal;
    }
    //#endregion
}
