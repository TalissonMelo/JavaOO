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
public class Exercicio04 {

    public static void main(String[] args) {

        int i,numero;
        String name = "";
        
        name = JOptionPane.showInputDialog("Digite o numero para Tabuada: ");
        numero = Integer.parseInt(name);
        String resultado = "";

        for (i = 0; i < 11; i++) {

            resultado += numero + " X " + i + " = " + (numero * i) + "\n";

        }

        JOptionPane.showMessageDialog(null, resultado);
    }

}
