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
        ArrayList<Client> c;
        var s = new Scanner(System.in);
        String novo;
        int i;
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
            System.out.println("Deseja cadastrar mais algum produto? (S/N)");
            novo = s.next();
        }while(novo == "S");
        System.out.println("Bom, agora já temos ao menos uma empresa e um produto");
        System.out.println("Vamos agora aos clientes e vendas");
        System.out.println("Alguem acessou nosso site, vamos cadastralo(s)");
        do{
            System.out.println("Digite o nome do cliente: ");
            String nome = s.next();

            System.out.println("Email: ");
            String email = s.next();

            System.out.println("Telefone: ");
            String phone = s.next();

            System.out.println("CPF ou CNPJ: ");
            String cpfOrCnpj = s.next();

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
            c.add(new Client(nome, email, phone, cpfOrCnpj, new Adress(zip, street, number, district, town, complement, reference)));
            System.out.println("Deseja cadastrar mais algum cliente? (S/N)");
            novo = s.next();
        }while(novo == "S");
        System.out.println("Vamos aos pedidos");
        do{
            if(e.size()>1){
                System.out.println("Qual a empresa receberá o pedido?");
                i = s.nextInt();
            }else{
                i = 0;
            }
            do{
                Client client;
                System.out.println("Código do Pedido: ");
                int idOrder = s.nextInt();
                
                System.out.println("Nome do Cliente: ");
                String nome = s.next();
                for (i=0;i<c.size();i++) {
                    try {
                        if(nome.equals(c.get(i).getName())){
                            client = c;
                        }
                    } catch (Exception y) {
                        System.out.println("Digite o nome do cliente: ");
                        String enome = s.next();

                        System.out.println("Email: ");
                        String email = s.next();

                        System.out.println("Telefone: ");
                        String phone = s.next();

                        System.out.println("CPF ou CNPJ: ");
                        String cpfOrCnpj = s.next();

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
                        client = c.add(new Client(enome, email, phone, cpfOrCnpj, new Adress(zip, street, number, district, town, complement, reference)));
                    }
                }
                do{
                    System.out.println("Produto:");
                    String prod = s.nextLine();
                    System.out.println("Quantidade desejada");
                    int qtd = s.nextInt();
                    demand.AddProduct(prod, qtd);
                    System.out.println("Adicionar novo produto?");
                }while (novo.equals("S"));

                System.out.println("Forma de Pagamento: ");
                Payment payment = s.next();
                
                e.get(i).setDemand(idOrder, client, payment);
                System.out.println("Novo pedido para essa empresa? (S/N)");
                novo = s.next();
            }while(novo == "S");
            System.out.println("Novo pedido para outra empresa? (S/N)");
            novo = s.next();
        }while(novo == "S");
        System.out.println("Pedidos Feitos");
        do{
        System.out.println("Agora o que deseja fazer?");
        System.out.println("1 - obter informações do pedido");
        System.out.println("2 - Obter total faturado do pedido");
        System.out.println("3 - Consultar rendimento por período");
        System.out.println("4 - Obter total por forma de pagamento");
        System.out.println("5 - Verificar forma de pagamento mais escolhida");
        System.out.println("0 - Já terminei o dia. Pode encerrar o sistema");
        int op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Qual cliente deseja consultar o Pedido?");
                    String cli = s.next();
                    e.PrintDemand(cli);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    e.mostPayment();
                    break;
                case 0:
                    System.out.println("Obrigado pela preferencia, até a próxima!");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while (op!=0);
    }
}