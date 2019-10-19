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
public class Execicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = "";
        double valor, desconto , resultado;
        
        name = JOptionPane.showInputDialog("Digite o Valor do Produto");
        valor = Double.parseDouble(name);
        
        name = JOptionPane.showInputDialog("Digite a Porcentagem de Desconto: ");
        desconto = Double.parseDouble(name);
        
        resultado = valor * desconto /100;
        
        JOptionPane.showMessageDialog(null,"Desconto: " + resultado + "\nProduto com Desconto: " + (valor - resultado));
        
    }
    
}
