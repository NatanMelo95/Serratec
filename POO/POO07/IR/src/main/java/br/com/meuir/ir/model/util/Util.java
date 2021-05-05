package model.util;

public class Util {

    //#region inss
    public static double inss(double salarioBruto) {
        var porcentagemDoINSS = 0.0;
        double inss = 0.0;

        if(salarioBruto <= 1100.00){
            porcentagemDoINSS = 0.075;
            inss = (salarioBruto * porcentagemDoINSS) - 0.0;
        }
        else if(salarioBruto >= 1100.01 && salarioBruto < 2203.48){
            porcentagemDoINSS = 0.09;
            inss = (salarioBruto * porcentagemDoINSS) - 16.5;
        }
        else if(salarioBruto >= 2203.49 && salarioBruto < 3305.22 ){
            porcentagemDoINSS = 0.12;
            inss = (salarioBruto * porcentagemDoINSS) - 82.61;
        }
        else if(salarioBruto >= 3305.22 && salarioBruto < 6433.57){
            porcentagemDoINSS = 0.14;
            inss = (salarioBruto * porcentagemDoINSS) - 148.72;
        }
        else{
            inss = 751.97;
        } 
        return inss;
    }
    //#endregion


    public static Double salarioDescontado(Double salarioBruto){
        Double salarioDescontado = 0.0;
        salarioDescontado = salarioBruto - inss(salarioBruto);
        return salarioDescontado;
    }  

    //#region aliquota
    public static Double aliquota(Double salarioDescontado){
        double aliquota = 0.0;
        
        if(salarioDescontado < 1903.98){
            aliquota  = 0.0;
        }else if((salarioDescontado >= 1903.99) && (salarioDescontado < 2826.65)){
            aliquota = 0.075;
        }else if((salarioDescontado >= 2825.66) && (salarioDescontado < 3751.05)){
            aliquota = 0.15;
        }else if((salarioDescontado >= 3751.06) && (salarioDescontado < 4664.68)){
            aliquota = 0.225;
        }else{
            aliquota = 0.275;
        }
        return aliquota;
    }
    //#endregion
    
    //#region deducao
    public static double deducao(double salarioLiquido) {
        double deducao = 0.0;            
    
        if(salarioLiquido <= 1903.98){
        deducao = 0.0;
        }else if((salarioLiquido >= 1903.99) && (salarioLiquido < 2826.65)){
        deducao = 142.80;
        }else if((salarioLiquido >= 2825.66) && (salarioLiquido < 3751.05)){
            deducao = 354.80;
        }else if((salarioLiquido >= 3751.06) && (salarioLiquido < 4664.68)){
        deducao = 636.13;
        }else{
        deducao = 8.36;
        } 
        return deducao;
    }
    //#endregion

    public static Double irrf(Double salarioBruto, Integer dependentes) {
        Double salario = salarioDescontado(salarioBruto);        
        Double irrf = (salario * Util.aliquota(salario) - Util.deducao(salario));
        return irrf;
    }
    public static Double salarioLiquido(Double salarioDescontado, Double irrf){
        double salarioLiquido = salarioDescontado - irrf;
        return salarioLiquido;
    }
}