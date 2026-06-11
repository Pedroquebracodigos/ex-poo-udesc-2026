package exercicio3oo.testes;

import exercicio3oo.classes.Carro;
import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        carro.setMarca(leitor.nextLine());

        System.out.print("Digite o modelo do carro: ");
        carro.setModelo(leitor.nextLine());

        System.out.print("Digite o ano do carro: ");
        carro.setAno(leitor.nextInt());

        System.out.print("Digite a velocidade do carro: ");
        carro.setVelocidade(leitor.nextDouble());

        // Impressão dos resultados usando Getters e printf()
        System.out.printf("%n--- Dados do Carro ---%n");
        System.out.printf("Marca: %s%n", carro.getMarca());
        System.out.printf("Modelo: %s%n", carro.getModelo());
        System.out.printf("Ano: %d%n", carro.getAno());
        System.out.printf("Velocidade: %.2f%n", carro.getVelocidade());

        leitor.close();
    }
}