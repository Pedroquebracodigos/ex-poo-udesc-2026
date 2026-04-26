package exercicio1oo.classes;
import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        carro.marca = leitor.nextLine();

        System.out.print("Digite o modelo do carro: ");
        carro.modelo = leitor.nextLine();

        System.out.print("Digite o ano do carro: ");
        carro.ano = leitor.nextInt();

        System.out.print("Digite a velocidade do carro: ");
        carro.velocidade = leitor.nextDouble();

        System.out.println("\n--- Dados do Carro ---");
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);

        leitor.close();
    }
}