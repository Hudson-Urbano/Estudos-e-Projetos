package Projetos;

import java.util.Scanner;

public class SistemaCadastroCurso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = scanner.nextFloat();

    System.out.printf("A nota de %s é %.2f \n" , nome, nota);

    }

}
