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
public class Exer2 {

    public static void main(String[] args) {

        double price;
        do {

            price = Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto: "));
            price += price * 12 / 100;
            JOptionPane.showMessageDialog(null, "O Valor com acrescimo é R$: " + price + "\nO Valor Arrendondado: " + Math.round(price));
        } while (price != 0);

    }

}
