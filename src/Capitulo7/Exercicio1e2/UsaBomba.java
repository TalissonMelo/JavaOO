/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1e2;

import java.util.Scanner;

/**
 *
 * @author talis
 */
public class UsaBomba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Bomba bomba1 = new Bomba();
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite os segundos para bomba: ");
        int segundos = input.nextInt();
        
        bomba1.ligar(segundos);
    }
    
}
