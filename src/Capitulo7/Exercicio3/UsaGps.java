/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author talis
 */
public class UsaGps {
    
    public static void main(String [] args){
    
        Gps usaGps;
        Scanner input = new Scanner (System.in); 
        
        System.out.print("Selecione idioma: \nPortugues\nIngles\n\nIdioma :");
        String idioma = input.nextLine();
        
        if( idioma.equalsIgnoreCase("Portugues")){
        
            idioma = "Portugues";
        }else if(idioma.equalsIgnoreCase("Ingles")){
        
            idioma = "Inglês";
        }else{
        
            idioma = "";
        }
        
        System.out.println("Qual a rota: ");
        String rota = input.nextLine();
        
        usaGps = new Gps(idioma, rota);
        usaGps.mostrar();
    }
    
}
