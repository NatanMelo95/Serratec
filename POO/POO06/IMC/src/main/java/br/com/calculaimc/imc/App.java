package main.java.br.com.calculaimc.imc;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.br.com.calculaimc.imc.model.usuario.Usuario;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Usuario> user = new ArrayList<Usuario>();
        Scanner s = new Scanner(System.in);
        String novo;
        int op;
        int i;
        System.out.println("**********************************");
        System.out.println("********Calculadora de IMC********");
        System.out.println("**********************************");
        do{
            System.out.println("O que deseja fazer? \n1 - cadastrar novo usuário \n2 - Obter calculo \n0 - sair");
            op = s.nextInt();
            switch (op) {
                case 1:
                    do{
                        System.out.println("Nome do usuário: ");
                        String nome = s.next();
                        System.out.println("Peso do usuário: ");
                        int peso = s.nextInt();
                        System.out.println("Altura do usuário: ");
                        int altura = s.nextInt();
                        System.out.println("Idade do usuário: ");
                        int idade = s.nextInt();
                        System.out.println("Sexo do usuário: ");
                        String sexo = s.next();
                        user.add(new Usuario(peso, nome, altura, idade, sexo));
                        System.out.println("Deseja cadastrar mais algum usuário? (S/N)");
                        novo = s.next();
                    }while(novo == "S");
                    break;
                case 2:
                    if (user.size() > 0) {
                        System.out.println("Qual Usuário deseja ver o IMC");
                        String nm = s.next();
                        for (i=0;i<user.size();i++) {
                            if(nm.equals(user.get(i).getNome())){
                                System.out.println(user.get(i).ImcCalculator());
                            }
                        }
                    }else{
                        System.out.println("Nenhum usuário informado");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando Aplicação");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(op!=0);
        s.close();
    }
}