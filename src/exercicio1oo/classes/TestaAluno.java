package exercicio1oo.classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Aluno fulano = new Aluno();
        System.out.print("Nome: ");
        fulano.nome = leitor.nextLine(); //leitura de string

        System.out.println("Matricula: ");
        fulano.matricula = leitor.nextLine();

        System.out.println("Idade: ");
        fulano.idade = leitor.nextInt(); //leitura de int

        System.out.println("Nota 1: ");
        fulano.nota1 = leitor.nextInt();

        System.out.println("Nota 2: ");
        fulano.nota2 = leitor.nextInt();

        System.out.println("Nota 3: ");
        fulano.nota3 = leitor.nextInt();

        System.out.println("Nota 4: ");
        fulano.nota4 = leitor.nextInt();

        System.out.println("Dados do Aluno: ");
        System.out.println("--------------");
        System.out.println("Nome: " + fulano.nome);
        System.out.println("Matricula: " + fulano.matricula);
        System.out.println("Nota 1: " + fulano.nota1);
        System.out.println("Nota 2: " + fulano.nota2);
        System.out.println("Nota 3: " + fulano.nota3);
        System.out.println("Nota 4: " + fulano.nota4);




    }
}
