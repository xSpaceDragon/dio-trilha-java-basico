
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner digitacao = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Float saldo;

        System.out.println("Conta Bancária");
        System.out.println("Digite o número da conta.");
        numero = digitacao.nextInt();

        System.out.println("Digite o número da agência.");
        agencia = digitacao.next();

        System.out.println("Digite o seu nome.");
        nomeCliente = digitacao.next();

        System.out.println("Digite o saldo.");
        saldo = digitacao.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        digitacao.close();
    }
}
