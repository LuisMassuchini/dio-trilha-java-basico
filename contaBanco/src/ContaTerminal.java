import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Banco da Fortuna, siga os passos do programa para abertura da conta.");
        System.out.println("Qual é o seu nome? ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Saldo inicial:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
