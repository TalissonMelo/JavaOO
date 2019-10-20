/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1e2;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author talis
 */
public class Bomba {
    
    private boolean status;
    
    public void ligar(int segundos) throws InterruptedException {
        
        this.status = true;
        
        for (int i = segundos; i >= 1; i--) {
            System.err.println("Falta " + i + " para bomba desligar!");
            TimeUnit.SECONDS.sleep(1);
       
            
        }
        System.out.println("Monitoramento Terminado!");
        desligar();
        
    }

    public void desligar() {
        
        this.status = false;
    }
    
}
