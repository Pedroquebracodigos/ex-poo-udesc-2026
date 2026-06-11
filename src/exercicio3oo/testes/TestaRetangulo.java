package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;
import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a largura do retângulo: ");
        retangulo.setLargura(leitor.nextDouble());

        System.out.print("Digite a altura do retângulo: ");
        retangulo.setAltura(leitor.nextDouble());

        System.out.printf("%n--- Dados do Retângulo ---%n");
        System.out.printf("Largura: %.2f%n", retangulo.getLargura());
        System.out.printf("Altura: %.2f%n", retangulo.getAltura());

        leitor.close();
    }
}