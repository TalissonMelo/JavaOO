/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo3;

import javax.swing.JOptionPane;

/**
 *
 * @author talis
 */
public class Exercicio03 {

    public static void main(String[] args) {

        final String user = "java8";
        final String password = "java8";
        
        int tentativas = 3;
        String usuario, senha;

        do {
            usuario = JOptionPane.showInputDialog("Usuario");
            senha = JOptionPane.showInputDialog("Senha");

            if (!user.equals(usuario) || !password.equals(senha)) {
                tentativas--;
                JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\nVocê tem mais " + tentativas + " tentativas.");
            } else {
                JOptionPane.showMessageDialog(null, "Login e senha aceitos!!!");
            }
        } while (tentativas > 0 && (!user.equals(usuario) || !password.equals(senha)));
    }

}
