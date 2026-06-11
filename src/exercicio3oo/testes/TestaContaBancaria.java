package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;
import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o número da conta: ");
        conta.setNumeroConta(leitor.nextLine());

        System.out.print("Digite o titular da conta: ");
        conta.setTitular(leitor.nextLine());

        System.out.print("Digite o saldo inicial: ");
        conta.setSaldo(leitor.nextDouble());

        System.out.printf("%n--- Dados da Conta Bancária ---%n");
        System.out.printf("Número da Conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());

        leitor.close();
    }
}