package Exercicios;

import javax.swing.JOptionPane;

public class AppInterfaceSwing {
    public static void main(String[] args) {
        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
        String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota:");
        
        // Converter as notas de String para double
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double nota3 = Double.parseDouble(nota3Str);
        
        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Exibir a média
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);

        if (media >=7){
            JOptionPane.showMessageDialog(null, "Aprovado! com a média: " + media);
        }else {
            JOptionPane.showMessageDialog(null, "Reprovado! com a média: " + media);
        }
    }
}