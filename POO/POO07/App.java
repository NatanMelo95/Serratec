public class App {

    public static void main(String[] args) {
        System.out.println("*****************************");   
        System.out.println("******Aprendendo static******");
        System.out.println("*****Aprendendo abstract*****");
        System.out.println("*****************************");

        Utils.enviarEmail("Fulano@gmail.com", "POO", "Aprender POO");
        Utils.enviarMensagemWhatsApp("21999998888", "Ola!!");
        System.out.println(Utils.calcularNovoSalario(1000.0));
    }
}