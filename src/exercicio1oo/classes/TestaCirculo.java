package exercicio1oo.classes;
import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do círculo: ");
        circulo.raio = leitor.nextDouble();

        System.out.println("\n--- Dados do Círculo ---");
        System.out.println("Raio: " + circulo.raio);

        leitor.close();
    }
}