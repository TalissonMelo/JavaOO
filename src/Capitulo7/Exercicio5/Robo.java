/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

/**
 *
 * @author talis
 */
public class Robo implements Controle{

    @Override
    public String getAndar() {
        
      System.out.println("Andando..");
      return null;
    }

    @Override
    public String getVirar() {
    
        System.out.println("Virando..");
        return null;
    }

    @Override
    public String getFalar() {
    
        System.out.println("Falando..");
        return null;
    }
}
