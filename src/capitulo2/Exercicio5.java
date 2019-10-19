/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author talis
 */
public class Exercicio5 {
    
    public static void main(String [] agrs){
    
        String sexo = JOptionPane.showInputDialog("Digite seu sexo:");

        Scanner input = new Scanner(System.in);
        
        System.out.print("Sua Idade: ");
        int idade = input.nextInt();

        System.out.print("Anos De Contribuição: ");
        int contribuicao = input.nextInt();

        if (sexo.equalsIgnoreCase("masculino")) {
            if (idade >= 65) {
                JOptionPane.showMessageDialog(null, "Aposentado por idade.");
            } else {
                if (contribuicao >= 35) {
                    JOptionPane.showMessageDialog(null, "Aposentado por contribuição.");
                } else {
                    int falta = 35 - contribuicao;
                    JOptionPane.showMessageDialog(null, "Restam " + falta + " anos contribuição.");
                }
            }
        } else if (sexo.equalsIgnoreCase("feminino")) {
            if (idade >= 60) {
                JOptionPane.showMessageDialog(null, "Aposentada por idade.");
            } else {
                if (contribuicao >= 30) {
                    JOptionPane.showMessageDialog(null, "Aposentada por contribuição.");
                } else {
                    int falta = 30 - contribuicao;
                    JOptionPane.showMessageDialog(null, "Resta " + falta + " anos contribuição.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ainda não definido.");

        }
    }
    
}
