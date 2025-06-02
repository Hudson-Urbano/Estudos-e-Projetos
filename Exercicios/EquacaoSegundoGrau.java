package Exercicios;

import javax.swing.JOptionPane;
public class EquacaoSegundoGrau {
    public static void main(String[] args) {

//declaração de variaveis
        String n1_str, n2_str;
        double n1, n2;
//entrada
        n1_str = JOptionPane.showInputDialog("Digite a primeira nota: ");
        n2_str = JOptionPane.showInputDialog("Digite a segunda nota: ");
//processamento
        n1 = Double.parseDouble(n1_str);
        n2 = Double.parseDouble(n2_str);

        double m = (n1+n2)/2;
        JOptionPane.showMessageDialog(null, "sua média foi " + m);
//saida
        if(m>=7){
            JOptionPane.showMessageDialog(null, "Parabéns você foi aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "Você foi reprovado!");
        }
    }
}
