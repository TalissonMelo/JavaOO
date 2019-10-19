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
public class Exercicio3 {

    public static void main(String[] args) {

        String name = "";
        double valorDaTransacao, valorVenal, percentual, maior;

        name = JOptionPane.showInputDialog("Valor da Transação: ");
        valorDaTransacao = Double.parseDouble(name);

        name = JOptionPane.showInputDialog("Valor Venal: ");
        valorVenal = Double.parseDouble(name);

        name = JOptionPane.showInputDialog("Percentual De Imposto: ");
        percentual = Double.parseDouble(name);

        if (valorDaTransacao > valorVenal) {

            maior = valorDaTransacao;
        } else {

            maior = valorVenal;
        }
        maior += maior * percentual / 100;
        JOptionPane.showMessageDialog(null, "Valor Do Imposto a ser Pago: " + maior);

    }

}
