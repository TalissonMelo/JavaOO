/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

import javax.swing.JOptionPane;

/**
 *
 * @author talis
 */
public class Exercicio4 {

    public static void main(String[] args) {

        double prova1, prova2, trabalho, resul;

        prova1 = Double.parseDouble(JOptionPane.showInputDialog("Resultado prova : "));
        prova2 = Double.parseDouble(JOptionPane.showInputDialog("Resultado 2º prova: "));
        trabalho = Double.parseDouble(JOptionPane.showInputDialog("Resultado Trabalho: "));

        resul = (prova1 + prova2 + trabalho) / 3;
        
        if (resul >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado media igual: " + resul);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado! nota: " + resul);

        }
    }

}
