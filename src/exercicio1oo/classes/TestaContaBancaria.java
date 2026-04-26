package exercicio1oo.classes;
import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o número da conta: ");
        conta.numeroConta = leitor.nextLine();

        System.out.print("Digite o nome do titular: ");
        conta.titular = leitor.nextLine();

        System.out.print("Digite o saldo da conta: ");
        conta.saldo = leitor.nextDouble();

        System.out.println("\n--- Dados da Conta Bancária ---");
        System.out.println("Número da Conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);

        leitor.close();
    }
}