public class Iniciar{
    public static void main(String[] args) {    
        Scanner s = new Scanner(System.in);
        public static void Iniciar() {
            var produto = "Deseja cadastrar novo produto? (S/N)";
            System.out.println("Olá, bem vindo");
            System.out.println(produto);
            var cadastrar = s.next();
            switch (cadastrar) {
                case S:
                    System.out.println("informe o nome");
                    var nome = s.next();
                    System.out.println("informe a quantidade");
                    var quantidade = s.next();
                    System.out.println("informe o valor unitário");
                    var valorUnitario = s.next();
                    System.out.println("informe o vencimento do pagamento");
                    var validade = s.next();
                    
                    break;
                case N:
                    
                    break;
                default:
                    break;
            }

        }
    }
}