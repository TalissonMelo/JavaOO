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
public class Exer3 {

    public static void main(String[] args) {

        int result;

        result = 5 + ((int)(Math.random() * 5));

        JOptionPane.showMessageDialog(null, "Nùmeros sorteado : " + result);

        int[] valor = new int[result];
        String soma = "";

        for (int i = 0; i < result; i++) {

            valor[i] = (int) (Math.random() * 10);
            soma += valor[i];

        }

        JOptionPane.showMessageDialog(null,"Número Sorteado: "+ result +  "\nSenha: " + soma);

    }

}
