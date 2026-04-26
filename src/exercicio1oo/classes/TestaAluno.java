package exercicio1oo.classes;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        // Entrada de dados
        System.out.print("Digite a matrícula do aluno: ");
        aluno.matricula = leitor.nextLine();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = leitor.nextLine();

        System.out.print("Digite a idade: ");
        aluno.idade = leitor.nextInt();

        System.out.print("Digite a nota 1: ");
        aluno.nota1 = leitor.nextInt();

        System.out.print("Digite a nota 2: ");
        aluno.nota2 = leitor.nextInt();

        System.out.print("Digite a nota 3: ");
        aluno.nota3 = leitor.nextInt();

        System.out.print("Digite a nota 4: ");
        aluno.nota4 = leitor.nextInt();

        // Impressão dos resultados
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Nota 3: " + aluno.nota3);
        System.out.println("Nota 4: " + aluno.nota4);

        leitor.close();
    }
}