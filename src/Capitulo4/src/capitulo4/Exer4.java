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
public class Exer4 {

    
    public static void main (String [] args){
    
        String frase;
        String result = "";
        
        frase = JOptionPane.showInputDialog("Frase Fornecida: ");
        
        for(int i = frase.length()-1; i >= 0 ; i--){
        result += frase.charAt(i);
           
        }
        
        JOptionPane.showMessageDialog(null, "Frase Fornecida: " + frase + "\nFrase Invertida: " + result.replace(" ",""));
    }
    
}
