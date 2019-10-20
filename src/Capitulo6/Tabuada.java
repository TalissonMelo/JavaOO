/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6;
import java.util.Scanner;
/**
 *
 * @author 182-000374
 */
public class Tabuada {
    
    public static void main (String [] args){
    
        Scanner input = new Scanner(System.in);
        int numero,i;
        int valor;
        
        
        System.out.print("Digite o numero pra tabuada: ");
        numero = input.nextInt();
        for (i=0;i<11;i++){
        
            System.out.println( i + " X " + numero + " = " + (i * numero ) );
            
        }
        
    }
}
