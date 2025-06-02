package condicionais;

import java.util.Scanner;

public class SwitchCaseExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pernas = scanner.nextInt();
        String tipo;

        tipo = switch (pernas) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 4 -> "Quadrúpede";
            case 6, 8 -> "Aranha";
            default -> "ET";
        };
        
        System.out.println(tipo);
    }
}
