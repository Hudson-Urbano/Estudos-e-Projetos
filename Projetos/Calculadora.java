package Projetos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        char operador = input.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double num2 = input.nextDouble();

        double resultado;

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '/') {
            if (num2 == 0) {
                System.out.println("Erro: divisão por zero!");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Operador inválido.");
        }

        input.close();
    }
}
