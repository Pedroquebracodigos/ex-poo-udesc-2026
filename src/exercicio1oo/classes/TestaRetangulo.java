package exercicio1oo.classes;
import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a largura: ");
        retangulo.largura = leitor.nextDouble();

        System.out.print("Digite a altura: ");
        retangulo.altura = leitor.nextDouble();

        System.out.println("\n--- Dados do Retângulo ---");
        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);

        leitor.close();
    }
}