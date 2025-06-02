package Projetos;

import javax.swing.JOptionPane;

public class votos {
    public static void main(String[] args) {
        String ano_atual_str, ano_nasc_str;
        int idade, ano_atual, ano_nasc;

        ano_atual_str = JOptionPane.showInputDialog(null, "Digite o ano atual: ");
        ano_nasc_str = JOptionPane.showInputDialog(null, "Digite o ano do seu nascimento: ");

        ano_atual = Integer.parseInt(ano_atual_str);
        ano_nasc = Integer.parseInt(ano_nasc_str);

        idade = ano_atual - ano_nasc;

        JOptionPane.showMessageDialog(null, "Sua idade é " + idade);

        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Você não pode votar!");
        } else if (idade <= 16 || idade < 18) {
            JOptionPane.showMessageDialog (null, "Seu voto é opcional! ");
        } else if (idade<= 18 || idade <= 70) {
            JOptionPane.showMessageDialog(null, "Seu voto é obrigatório! ");
        } else if (idade > 70) {
            JOptionPane.showMessageDialog(null, "Seu voto é opcional! ");
        }
    }
}
