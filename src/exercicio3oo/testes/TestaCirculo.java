package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;
import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do círculo: ");
        circulo.setRaio(leitor.nextDouble());

        // Impressão dos resultados usando Getters e printf()
        System.out.printf("%n--- Dados do Círculo ---%n");
        System.out.printf("Raio: %.2f%n", circulo.getRaio());

        leitor.close();
    }
}