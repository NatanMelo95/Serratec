import java.util.Date;
import java.util.InputMismatchException;
import models.cliente.Cliente;
import models.contas.ContaCorrente;
import models.contas.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("***** Iniciando nosso Banco Digital *****");
        System.out.println("*****************************************");
        System.out.println();

        // System.out.print(new Date());
        // var cliente = new Cliente();

        var contaDaAmanda = new ContaCorrente("0001","7541", 5, 1500);
        var contaDoMarcelo = new ContaPoupanca("0001", "7542" , 6, 50);

        var valorDaPizza = contaDaAmanda.sacar(200);
        var valorDaPizzaBrotinho = contaDoMarcelo.sacar(30);

        var valorDoMC = contaDaAmanda.sacar(100);

        contaDaAmanda.depositar(500);
        contaDoMarcelo.depositar(500);

        System.out.println("Amanda:");
        contaDaAmanda.imprimirExtrato();


        System.out.println("Marcelo:");
        contaDoMarcelo.imprimirExtrato();
      
    }
}