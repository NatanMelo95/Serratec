package main.java.br.com.nmanutencoes;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.br.com.nmanutencoes.model.clients.Adress;
import main.java.br.com.nmanutencoes.model.demand.Demand;
import main.java.br.com.nmanutencoes.model.enterprise.Enterprise;

public class App {
    public static void main(String[] args) {
        ArrayList<Enterprise> e;
        ArrayList<Product> p;
        var s = new Scanner(System.in);
        String novo;
        System.out.println("Olá");
        System.out.println("Vamos cadastrar sua Empresa");
        do{
            System.out.println("Digite o nome da empresa: ");
            String nome = s.next();
            
            System.out.println("Qual o CEP? ");
            String zip = s.next();
            
            System.out.println("Nome da Rua:");
            String street = s.nextLine();

            System.out.println("Número: ");
            int number = s.nextInt();
            
            System.out.println("Bairro: ");
            String district = s.next();

            System.out.println("Cidade:");
            String town = s.nextLine();

            System.out.println("Complemento:");
            String complement = s.nextLine();

            System.out.println("Referencia:");
            String reference = s.nextLine();
            e.add(new Enterprise(nome, new Adress(zip, street, number, district, town, complement, reference)));
            System.out.println("Deseja cadastrar mais alguma empresa? (S/N)");
            novo = s.next();
        }while(novo == "S");
        System.out.println("Vamos cadastrar os produtos agora");
        int code = 0;
        do{
            code++;
            System.out.println("Digite o nome do produto: ");
            String nome = s.nextLine();
            
            System.out.println("Descrição");
            String description = s.nextLine();

            System.out.println("Categoria ");
            Category category = s.next();
            
            System.out.println("Quantidade ");
            int amount = s.nextInt();

            System.out.println("Valor");
            Double value = s.nextDouble();
            p.add(new Product(code, nome, description, category, amount, value));
            System.out.println("Deseja cadastrar mais alguma empresa? (S/N)");
            novo = s.next();
        }while(novo == "S");
        System.out.println("Bom, agora já temos ao menos uma empresa e um produto");
        System.out.println("Vamos agora aos clientes e vendas");
        
    }
}