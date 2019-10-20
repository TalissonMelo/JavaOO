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
public class Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] result = new int[6];
        int soma = 0;

        for (int i = 0; i < 6; i++) {

            result[i] = (int) (Math.random() * 60) + 1;
            soma += result[i];

        }

        JOptionPane.showMessageDialog(null, "Nùmeros sorteados : \n"
                + result[0]
                + ", " + result[1]
                + ", " + result[2]
                + ", " + result[3]
                + ", " + result[4]
                + ", " + result[5]
                + "\nSoma igual a: " + soma);
    }

}
