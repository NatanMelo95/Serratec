package src.main.java.br.com.turmadosferas.lanchonete;

import src.main.java.br.com.turmadosferas.lanchonete.model.cliente.Cliente;
import src.main.java.br.com.turmadosferas.lanchonete.model.cliente.Endereco;
import src.main.java.br.com.turmadosferas.lanchonete.model.pedido.Pedido;
import src.main.java.br.com.turmadosferas.lanchonete.model.produto.Produto;
import src.main.java.br.com.turmadosferas.lanchonete.model.produto.TipoProduto;

public class App {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("******* Lanchone dos feras ********");
        System.out.println("***********************************");
        System.out.println();

    var enderecoGeral = new Endereco("Rua Amapa", 52, "Teresóplis", "Casa 2 fundos");

    var taiana = new Cliente(3, "Taiana", "21999998523", enderecoGeral);

    var pedido = new Pedido(0, "Lanche da tarde", taiana);
    
    pedido.adicionarProduto(
        new Produto(1, "Pizza 4 Queijos (Brotinho)", TipoProduto.PIZZAS, 3, 5.0, 0.0, "Mandar molhos extras.")
    );

    pedido.adicionarProduto(
        new Produto(2, "Coca Cola 2lts", TipoProduto.BEBIDAS, 1, 10.0, 0.0, "Bem gelada, mandar limão e gelo")
    );

    pedido.adicionarProduto(
        new Produto(3, "Bolo de pote (Ninho com Nutella)", TipoProduto.DOCES, 2, 6.0, 1.0, "Caprichar na nutella ;)")
    );

    System.out.println("Valor total do pedido é R$" + pedido.calcularValorTotal());


    }
}
