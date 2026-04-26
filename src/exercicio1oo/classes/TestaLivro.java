package exercicio1oo.classes;
import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.print("Digite o título do livro: ");
        livro.titulo = leitor.nextLine();

        System.out.print("Digite o autor do livro: ");
        livro.autor = leitor.nextLine();

        System.out.print("Digite o gênero do livro: ");
        livro.genero = leitor.nextLine();

        System.out.print("O livro está emprestado? (true ou false): ");
        livro.emprestado = leitor.nextBoolean();

        System.out.println("\n--- Dados do Livro ---");
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Gênero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);

        leitor.close();
    }
}