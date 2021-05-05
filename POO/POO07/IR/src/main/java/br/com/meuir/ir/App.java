import java.util.ArrayList;
import java.util.Scanner;
import model.util.Util;
import model.funcionario.Funcionario;

public class App {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
        String novo;
        int op, i;
        //#region Scanner  
        var scanner = new Scanner(System.in);
        do{
            System.out.println("O que deseja fazer? \n1 - cadastrar novo funcionário \n2 - Obter calculo de IRRF \n0 - sair");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    do{
                        System.out.print("Digite seu nome: ");
                        String nome = scanner.next();
                        
                        System.out.print("Qual o seu cargo? ");
                        String cargo = scanner.next();
                        
                        System.out.print("Salário bruto: ");
                        Double salarioBruto = scanner.nextDouble();
                        
                        System.out.print("Quantos dependentes? ");
                        int dependentes = scanner.nextInt();
                        funcionario.add(new Funcionario(nome, cargo, salarioBruto, dependentes));
                        System.out.println("Deseja cadastrar mais algum usuário? (S/N)");
                        novo = scanner.next();
                    }while(novo == "S");
                    ////#endregion
                case 2:
                    if (funcionario.size() > 0) {
                        System.out.println("Qual funcionário deseja ver o IRRF");
                        String nm = scanner.next();
                        for (i=0;i<funcionario.size();i++) {
                            if(nm.equals(funcionario.get(i).getNome())){
                                var mensagem = String.format("Nome: %s Cargo: %s Salário Bruto: %s", funcionario.get(i).getNome(), funcionario.get(i).getCargo(), funcionario.get(i).getSalarioBruto());
                                var ir = String.format("IRRF: R$%.2f", Util.irrf(funcionario.get(i).getSalarioBruto(), funcionario.get(i).getDependentes()));
                                var liquido = String.format("Salario Liquido: R$%.2f", Util.salarioLiquido(Util.salarioDescontado(funcionario.get(i).getSalarioBruto()), Util.irrf(funcionario.get(i).getSalarioBruto(), funcionario.get(i).getDependentes())));
                                //#region System
                                System.out.println(mensagem);
                                System.out.println();
                                System.out.println(ir);
                                System.out.println(liquido);
                                //#endregion
                            }else{
                                System.out.println("Funcionário não encontrado");
                            }
                        }
                    }else{
                        System.out.println("Nenhum funcionário informado");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando Aplicação");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(op != 0);
        scanner.close();
    }
}