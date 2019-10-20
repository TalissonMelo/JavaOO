/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4;

import javax.swing.JOptionPane;

/**
 *
 * @author talis
 */
public class Exer5 {

    public static void main(String[] args) {

        String frase;

        frase = JOptionPane.showInputDialog("Forneça uma Frase: ");

        if (frase.contains("sexo")) {

            JOptionPane.showMessageDialog(null, "Proibido!.");
        } else if (frase.contains("sexual")) {

            JOptionPane.showMessageDialog(null, "Proibido.");
        } else {

            JOptionPane.showMessageDialog(null, frase);
        }

    }

}
