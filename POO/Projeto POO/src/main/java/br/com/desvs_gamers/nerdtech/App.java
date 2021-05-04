//#region Import
import model.cliente.Cliente;
import model.cliente.Login;
import model.endereco.Endereco;
import model.entrega.Entrega;
import model.pedido.Pedido;
import model.produto.Produto;
import model.produto.TipoCategoria;
import model.produto.TipoPlataforma;
import model.entrega.TipoEntrega;
//#endregion

public class App {
    public static void main(String[] args) {
        System.out.println(":::: Bem-vindo a NerdTech! ::::");

        //#region endereço
        var endereco = new Endereco("Luas", "Odyssey", "Mario", "Nintendo");
        var endereco2 = new Endereco("Triforce", "Ocarina", "Zelda", "Nintendo");
        //#endregion
        
        //#region clientes
        var cliente1 = new Cliente(1, "Erich", "994044405", endereco, 25);
        var cliente2 = new Cliente(2, "Sthephanie", "999909970", endereco2, 23);

        //#endregion

        //#region login
        var login1 = new Login("izigame", "mainyasuo", cliente1);
        var login2 = new Login("amominhasogra", "mentira", cliente2);   
        //#endregion
        
        //#region produto
        var produto = new Produto("Resident Evil", 10.0, TipoCategoria.TERROR, TipoPlataforma.NINTENDODS, 2, "Original");
        var produto2 = new Produto("Fifa2021", 12.0, TipoCategoria.ESPORTE, TipoPlataforma.PLASTATION5, 3, "Envia um brinde");
        var produto3 = new Produto("Skyrim ULTIMATE", 199.0, TipoCategoria.OPENWOLRD, TipoPlataforma.MULTIPLATAFORMA, 1, "MODS de Thomas e seus amigos");
        var produto4 = new Produto("Zelda versão Ben", 2000.00, TipoCategoria.TERROR, TipoPlataforma.NINTENDODS, 1, "Um jogo diferenciado");
        var produto5 = new Produto("The last of us 2", 350.0, TipoCategoria.TERROR, TipoPlataforma.PLASTATION5, 2, "Original, não quero pirata");
        //#endregion
        
        //#region pedido
        var pedido = new Pedido(1, "Zelda Versão Bem embalado para presente", cliente1, true, 20.0);
        var pedido2 = new Pedido(2, "FIFINHA BRABO", cliente2, false, 10.0);
        
        pedido.adicionarProduto(produto);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);
        pedido2.adicionarProduto(produto4);
        pedido2.adicionarProduto(produto5);
        //#endregion
        
        //#region entrega
        var entrega1 = new Entrega("CA455844", cliente1, TipoEntrega.LESMA);
        var entrega2 = new Entrega("CS589", cliente2, TipoEntrega.BLINK);
        //#endregion
        

        //#region System
        System.out.println("\n Olá, " + login1.getUsuario() + "!\n");
        System.out.println(":::: Pedido Realizado ::::\n");
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println(pedido.getProdutos());
        System.out.println(entrega1.previsaoDeEntrega());
        System.out.println("Valor total:" + pedido.calcularValorTotal());
        System.out.println();
        System.out.println("Volte sempre! A NerdTech agradece sua compra!");

        System.out.println("\nOlá, aventureiro " + login2.getUsuario() + "!\n");
        System.out.println("\n:::: Pedido Realizado ::::\n");
        System.out.println("Cliente:" + cliente2.getNome());
        System.out.println(pedido2.getProdutos());
        System.out.println(entrega2.previsaoDeEntrega());
        System.out.println("Valor total: " + pedido2.calcularValorTotal());
        System.out.println();
        System.out.println("Volte sempre! A NerdTech agradece sua compra!");
        //#endregion
    }
}