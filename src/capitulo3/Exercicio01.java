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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nome = "";
        float valorProduto = 0, descontoProduto = 0;

        nome = JOptionPane.showInputDialog("Nome do produto: ");
        valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto: "));

        if (valorProduto < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        } else if (valorProduto >= 50 && valorProduto < 200) {
            descontoProduto = valorProduto - ((valorProduto * 5) / 100);
        } else if (valorProduto >= 200 && valorProduto < 500) {
            descontoProduto = valorProduto - ((valorProduto * 6) / 100);
        } else if (valorProduto >= 500 && valorProduto < 1000) {
            descontoProduto = valorProduto - ((valorProduto * 7) / 100);
        } else if (valorProduto >= 1000) {
            descontoProduto = valorProduto - ((valorProduto * 8) / 100);
        }

        JOptionPane.showMessageDialog(null, "Produto : " + nome + "\nValor Original : " + valorProduto + "\nValor com Desconto: " + descontoProduto);

    }

}
