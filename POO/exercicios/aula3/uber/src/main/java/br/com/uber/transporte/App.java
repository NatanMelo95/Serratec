package main.java.br.com.uber.transporte;

import main.java.br.com.uber.transporte.model.motorista.Motorista;
import main.java.br.com.uber.transporte.model.passageiro.Passageiro;

public class App{
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Uber");
        //#region structure
        var motorista1 = new Motorista();
        var Passageiro1 = new Passageiro();
        //#endregion

        //#endregion Motorista
        motorista1.setNome("Natan");
        motorista1.setIdade(25);
        motorista1.setTelefone("(21) 99999-0001");
        motorista1.setTipoHabilitacao("AB");
        //#endregion

        //#region Passageiro
        Passageiro1.setNome("Maria");
        Passageiro1.setIdade(4);
        Passageiro1.setTelefone("(00) 00000-0000");
        //#endregion
        System.out.println(Passageiro1.comprimentar());;
        System.out.println(motorista1.comprimentar());;
    }
}