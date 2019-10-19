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
public class Exercicio02 {

    public static void main(String[] args) {

        int i;
        int soma = 0, maior = 0, menor = 1000000000;
        int[] resistencia = new int[4];

        for (i = 0; i < resistencia.length; i++) {

            resistencia[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "ª Resistencia: "));
            soma += resistencia[i];
        }
        for (i = 0; i < resistencia.length; i++) {

            if (resistencia[i] > maior) {

                maior = resistencia[i];
            }

            if (resistencia[i] < menor) {

                menor = resistencia[i];
            }

        }

        JOptionPane.showMessageDialog(null, "Resistências Fornecidas: \n" + resistencia[0]
                + "," + resistencia[1]
                + "," + resistencia[2]
                + "," + resistencia[3] 
                + "\nMaior Resisência: " + maior 
                + "\nMenor Resistência: " + menor
                + "\nResistência Equivalente: " + soma);

    }

}
