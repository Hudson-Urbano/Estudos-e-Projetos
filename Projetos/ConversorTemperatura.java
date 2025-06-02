package Projetos;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double c, f;

        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("--------------------------");

        System.out.println("Digite a temperatura atual: ");
        c = input.nextDouble();

        f = (c * 9/5) + 32;

        System.out.println("A temperatura convertida para fahrenheit é " + f);
        
    }
}