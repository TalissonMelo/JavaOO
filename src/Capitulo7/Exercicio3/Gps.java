/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author talis
 */
public class Gps {
    
    private String idioma;
    private String rota;
      
    public String getIdioma(){
    
        return idioma;
    }
    public void setIdoma(String idioma){
    
        this.idioma = idioma;
        
    }
    public String getRota(){
    
        return rota;
    }
    public void setRota(String rota){
    
        this.rota = rota;
    }
    public Gps(){
    
    }
    public Gps(String idioma, String rota){
    
        this.idioma = idioma;
        this.rota = rota;
    }
    public void mostrar(){
    
        System.out.println("Idioma : " + idioma + " , Rota: " + rota);
    }
   
}
