package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        // Entrada de dados usando Setters
        System.out.print("Digite a matrícula do aluno: ");
        aluno.setMatricula(leitor.nextLine());

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(leitor.nextLine());

        System.out.print("Digite a idade: ");
        aluno.setIdade(leitor.nextInt());

        System.out.print("Digite a nota 1: ");
        aluno.setNota1(leitor.nextInt());

        System.out.print("Digite a nota 2: ");
        aluno.setNota2(leitor.nextInt());

        System.out.print("Digite a nota 3: ");
        aluno.setNota3(leitor.nextInt());

        System.out.print("Digite a nota 4: ");
        aluno.setNota4(leitor.nextInt());

        // Impressão dos resultados usando Getters e printf()
        System.out.printf("%n--- Dados do Aluno ---%n");
        System.out.printf("Matrícula: %s%n", aluno.getMatricula());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d%n", aluno.getIdade());
        System.out.printf("Nota 1: %d%n", aluno.getNota1());
        System.out.printf("Nota 2: %d%n", aluno.getNota2());
        System.out.printf("Nota 3: %d%n", aluno.getNota3());
        System.out.printf("Nota 4: %d%n", aluno.getNota4());

        leitor.close();
    }
}