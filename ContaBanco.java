import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {

        double saldo = 144.552;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá usuário, digite seu número da Agência: ");
        int numAgencia = scanner.nextInt();

        System.out.println("Agora, digite seu nome: ");
        String nome = scanner.next();

        System.out.println(nome + " Digite sua Agência: ");
        String agencia = scanner.next();
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "conta" + numAgencia + "e seu saldo " + saldo + "já está disponível para saque");
    }
}
