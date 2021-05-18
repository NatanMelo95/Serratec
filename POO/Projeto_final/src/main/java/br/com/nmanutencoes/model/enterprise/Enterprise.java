package main.java.br.com.nmanutencoes.model.enterprise;

import java.util.ArrayList;
import java.util.Date;

import main.java.br.com.nmanutencoes.model.clients.Adress;
import main.java.br.com.nmanutencoes.model.demand.Demand;
import main.java.br.com.nmanutencoes.model.demand.Payment;
import main.java.br.com.nmanutencoes.util.Data;

public class Enterprise {
    //#region Variaveis
    private String name;
    private Adress adress;
    private ArrayList<Demand> demand;
    //#endregion

    //#region Constructors
    public Enterprise(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }
    //#endregion

    //#region GETs & SETs
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public ArrayList<Demand> getDemand() {
        return this.demand;
    }

    public void setDemand(ArrayList<Demand> demand) {
        this.demand = demand;
    }
    //#endregion

    //#region methods
    public void PrintDemand(String cli){
        int j;
        for (i=0; i<this.demand().size();i++){
            if(cli.equals(this.getDemand().getClient().getName())){
                System.out.println(""); 
                System.out.println("***************************************************************");  
                System.out.println("*********************** "+ this.name +" ***********************");  
                System.out.println("***************************************************************");  
                System.out.println(""); 

                var dataEHora = Data.formatarDataPadraoDataEHora(new Date());
                System.out.println("Data e hora da geração: " + dataEHora);
                System.out.println("");
                System.out.println("Cliente");
                System.out.println("");
                System.out.println("_______________________________________________________________");
                System.out.println("Nome: " + this.demand.get(i).getClient().getName());
                System.out.println("Rua: " + this.demand.get(i).getClient().getAdress().getStreet()+", "+ this.demand.get(i).getClient().getAdress().getNumber()+", Bairro: "+this.demand.get(i).getClient().getAdress().getDistrict());
                System.out.println("Referencia: " + this.demand.get(i).getClient().getAdress().getReference());
                System.out.println("");
                System.out.println("_______________________________________________________________");
                System.out.println("");
                System.out.println("Código    Nome     Quantidade    Valor Unitário     Valor total");

                for (j=0;j<this.demand.get(i).getProduct().size();j++) {
                    System.out.println(demand.get(i).FormatDemand(j));
                }
                System.out.println("");
                System.out.println("_______________________________________________________________");
                System.out.println(demand.get(i).FormatShipping());
                System.out.println("Desconto R$ " + demand.get(i).CalcDemandDiscount());
                System.out.println("Valor Total R$ " + demand.get(i).CalcDemand());
                System.out.println("***************************************************************");
                System.out.println("***************************************************************");    
                System.out.println("");
            }else{
                System.out.println("Pedido não encontrado");
            }
        } 
    }
    public String DateInterval(Date begin, Date end){
        int j;
        Double interval = 0.00;
        for(j=0;j<this.demand.size();j++){
            if (this.demand.get(j).getDate().after(begin) && this.demand.get(j).getDate().before(end)) {
                interval += demand.get(j).CalcDemand();
            }
        }
        return String.format("Seu saldo no período é: %.2f", interval);
    }
    public void MostPayment(){
        int i;
        var pi = 0;
        var cc = 0;
        var dc = 0;
        var bo = 0;
        var pp = 0;
        for(i=0;i<this.demand.size();i++){
            if (this.demand.get(i).getPayment().equals(Payment.PIX)) {
                pi++;
            }else if (this.demand.get(i).getPayment().equals(Payment.CREDITCARD)){
                cc++;
            }else if (this.demand.get(i).getPayment().equals(Payment.DEBITCARD)){
                dc++;
            }else if (this.demand.get(i).getPayment().equals(Payment.TICKET)){
                bo++;
            }else{
                pp++;
            }
            if(pi>cc){
                if(pi>dc){
                    if(pi>bo){
                        if(pi>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Pix");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }else{
                        if(bo>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Boleto");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }
                }else{
                    if(dc>bo){
                        if(dc>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Debito");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }else{
                        if(bo>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Boleto");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }
                }
            }else{
                if(cc>dc){
                    if(cc>bo){
                        if(cc>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Crédito");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }else{
                        if(bo>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Boleto");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }
                }else{
                    if(dc>bo){
                        if(dc>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Debito");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }else{
                        if(bo>pp){
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é Boleto");
                        }else{
                            System.out.println("Sua forma de pagamento com maior frequencia de uso é PicPay");
                        }
                    }
                }
            }
        }
    }
    public void MostPaymentValue(){
        int i;
        var pi = 0;
        var cc = 0;
        var dc = 0;
        var bo = 0;
        var pp = 0;
        for(i=0;i<this.demand.size();i++){
            if (this.demand.get(i).getPayment().equals(Payment.PIX)) {
                pi+=this.demand.get(i).getTotalValueDis();
            }else if (this.demand.get(i).getPayment().equals(Payment.CREDITCARD)){
                cc+=this.demand.get(i).getTotalValueDis();
            }else if (this.demand.get(i).getPayment().equals(Payment.DEBITCARD)){
                dc+=this.demand.get(i).getTotalValueDis();
            }else if (this.demand.get(i).getPayment().equals(Payment.TICKET)){
                bo+=this.demand.get(i).getTotalValueDis();
            }else{
                pp+=this.demand.get(i).getTotalValueDis();
            }
        }
        String formatPix = String.format("O valor total no Pix é %.2f", pi);
        String formatTic = String.format("O valor total no Boleto é %.2f", bo);
        String formatPic = String.format("O valor total no PicPay é %.2f", pp);
        String formatDeb = String.format("O valor total no Debito é %.2f", dc);
        String formatCre = String.format("O valor total no Crédito é %.2f", cc);
        System.out.println(formatPix);
        System.out.println(formatTic);
        System.out.println(formatPic);
        System.out.println(formatDeb);
        System.out.println(formatCre);
    }
    //#endregion
}
