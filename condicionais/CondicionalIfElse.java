package condicionais;

import javax.swing.JOptionPane;

public class CondicionalIfElse {
    public static void main(String[] args) {
        String nome, idade_str;
        int idade;
        nome = JOptionPane.showInputDialog ("digite seu nome: ");
        idade_str = JOptionPane.showInputDialog("Digite sua idade: ");
        idade = Integer.parseInt(idade_str);
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e você tem " + idade + " anos de idade ");
    }
}
