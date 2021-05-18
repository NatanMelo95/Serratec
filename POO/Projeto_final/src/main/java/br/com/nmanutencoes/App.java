package main.java.br.com.nmanutencoes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import main.java.br.com.nmanutencoes.model.clients.Adress;
import main.java.br.com.nmanutencoes.model.clients.Client;
import main.java.br.com.nmanutencoes.model.demand.Demand;
import main.java.br.com.nmanutencoes.model.demand.Payment;
import main.java.br.com.nmanutencoes.model.enterprise.Enterprise;
import main.java.br.com.nmanutencoes.model.itens.Category;
import main.java.br.com.nmanutencoes.model.itens.Product;
import main.java.br.com.nmanutencoes.util.Data;

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
            String type = s.next();
            Category category;
            System.out.println("Quantidade ");
            int amount = s.nextInt();

            System.out.println("Valor");
            Double value = s.nextDouble();
            if (type == "Nacional"){
                category = Category.NATIONAL;
            }else if(type == "Importado"){
                category = Category.IMPORTED;
            }else if(type == "Promoção"){
                category = Category.PROMOTION;
            }else{
                category = Category.FREESHIPPING;
            }
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
                System.out.println("Código do Pedido: ");
                int idOrder = s.nextInt();
                
                System.out.println("Nome do Cliente: ");
                String nome = s.next();
                Client client;
                for (i=0;i<c.size();i++) {
                    if(nome.equals(c.get(i).getName())){
                        client = c.get(i).clone();
                    }else{
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
                        c.add(new Client(enome, email, phone, cpfOrCnpj, new Adress(zip, street, number, district, town, complement, reference)));
                    }
                }
                do{
                    System.out.println("Produto:");
                    String prod = s.nextLine();
                    System.out.println("Quantidade desejada");
                    int qtd = s.nextInt();
                    e.get(i).getDemand().AddProduct(prod, qtd);
                    System.out.println("Adicionar novo produto?");
                }while (novo.equals("S"));

                System.out.println("Forma de Pagamento: ");
                String pay = s.next();
                Payment payment;
                if (pay == "Crédito"||pay == "Cartão de crédito"){
                    payment = Payment.CREDITCARD;
                }else if(pay == "Débito"||pay == "Cartão de débito"){
                    payment = Payment.DEBITCARD;
                }else if(pay == "Pix"){
                    payment = Payment.PIX;
                }else if(pay == "PicPay"){
                    payment = Payment.PICPAY;
                }else{
                    payment = Payment.TICKET;
                }
                e.get(i).setDemand(idOrder, client, payment);
                System.out.println("Novo pedido para essa empresa? (S/N)");
                novo = s.next();
            }while(novo == "S");
            System.out.println("Novo pedido para outra empresa? (S/N)");
            novo = s.next();
        }while(novo == "S");
        System.out.println("Pedidos Feitos");
        int op;
        do{
            System.out.println("Selecione uma empresa para consultar movimentação");
            String nome = s.nextLine();
            for (i=0;i<c.size();i++) {
                if(nome.equals(e.get(i).getName())){
                    do{
                    System.out.println("Agora o que deseja fazer?");
                    System.out.println("1 - obter informações do pedido");
                    System.out.println("2 - Obter total faturado do pedido");
                    System.out.println("3 - Consultar rendimento por período");
                    System.out.println("4 - Obter total por forma de pagamento");
                    System.out.println("5 - Verificar forma de pagamento mais escolhida");
                    System.out.println("0 - Já terminei o dia. Pode encerrar o sistema");
                    op = s.nextInt();
                    String cli;
                    int j;
                        switch (op) {
                            case 1:
                                System.out.println("Qual cliente deseja consultar o Pedido?");
                                cli = s.next();
                                e.get(i).PrintDemand(cli);
                                break;
                            case 2:
                                System.out.println("Data inicial");
                                String date1 = s.next();
                                Date begin = Data.formatarStringPadraoData(date1);
                                System.out.println("Data final");
                                String date2 = s.next();
                                Date end =  Data.formatarStringPadraoData(date2);
                                e.get(i).DateInterval(begin, end);
                                break;
                            case 3:
                                System.out.println("Qual cliente deseja consultar o Pedido?");
                                cli = s.next();
                                for (j=0; j<e.get(i).getDemand().size();j++){
                                    if(cli.equals(e.get(i).getDemand().getClient().getName())){
                                        String msg = String.format("Foi faurado R$%.2f no pedido do cliente %s", e.demand.CalcDemand(), cli);
                                    }
                                }
                                break;
                            case 4:
                                e.get(i).MostPaymentValue();
                                break;
                            case 5:
                                e.get(i).MostPayment();
                                break;
                            case 0:
                                System.out.println("Obrigado pela preferencia, até a próxima!");
                                break;
                            default:
                                System.out.println("Opção invalida");
                                break;
                        }
                    }while (op!=0);
                }else{
                    System.out.println("Empresa não encontrada!");
                }
            }
            System.out.println("Nova consulta para outra empresa?");
        }while(novo == "S");
    }
}