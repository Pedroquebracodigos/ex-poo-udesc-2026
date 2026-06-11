package exercicio3oo.testes;

import exercicio3oo.classes.Livro;
import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.print("Digite o título do livro: ");
        livro.setTitulo(leitor.nextLine());

        System.out.print("Digite o autor do livro: ");
        livro.setAutor(leitor.nextLine());

        System.out.print("Digite o gênero do livro: ");
        livro.setGenero(leitor.nextLine());

        System.out.print("O livro está emprestado? (true/false): ");
        livro.setEmprestado(leitor.nextBoolean());

        System.out.printf("%n--- Dados do Livro ---%n");
        System.out.printf("Título: %s%n", livro.getTitulo());
        System.out.printf("Autor: %s%n", livro.getAutor());
        System.out.printf("Gênero: %s%n", livro.getGenero());
        System.out.printf("Emprestado: %s%n", livro.isEmprestado() ? "Sim" : "Não");

        leitor.close();
    }
}