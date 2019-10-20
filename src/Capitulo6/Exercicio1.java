/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6;

import java.util.Scanner;


public class Exercicio1 {
public static String getMesPorExtenso(int mes, int idioma){

    switch(mes){
            case 1:
                if(idioma == 1){
                    return "Janeiro";
                }else if(idioma == 2){
                    return "Jan";
                }else {
                 return "Idioma invalido";
                }
            case 2:
                if(idioma == 1){
                    return "Fevereiro";
                }else if (idioma == 2){
                    return "Fer";
                }else {
                 return "Idioma invalido";
                }
            case 3:
                if(idioma == 1){
                    return "Março";
                }else if (idioma == 2){
                    return "Mar";
                }else {
                 return "Idioma invalido";
                }
            case 4:
                if(idioma == 1){
                    return "Abril";
                }else if (idioma == 2){
                    return "Abr";
                }else {
                 return "Idioma invalido";
                }
            case 5:
                if(idioma == 1){
                    return "Maio";
                }else if (idioma == 2){
                    return "Mai";
                }else {
                 return "Idioma invalido";
                }
            case 6:
                if(idioma == 1){
                    return "Junho";
                }else if (idioma == 2){
                    return "Jun";
                }else {
                 return "Idioma invalido";
                }
            case 7:
                if(idioma == 1){
                    return "Julho";
                }else if (idioma == 2){
                    return "Jul";
                }else {
                 return "Idioma invalido";
                }
            case 8:
                if(idioma == 1){
                    return "Agosto";
                }else if (idioma == 2){
                    return "Ago";
                }else {
                 return "Idioma invalido";
                }
            case 9:
                if(idioma == 1){
                    return "Setembro";
                }else if (idioma == 2){
                    return "Set";
                }else {
                 return "Idioma invalido";
                }
            case 10:
                if(idioma == 1){
                    return "Outubro";
                }else if (idioma == 2){
                    return "Out";
                }else {
                 return "Idioma invalido";
                }
            case 11:
                if(idioma == 1){
                    return "Novembro";
                }else if (idioma == 2){
                    return "Nov";
                }else {
                 return "Idioma invalido";
                }
            case 12:
                if(idioma == 1){
                    return "Dezembro";
                }else if (idioma == 2){
                    return "Dez";
                }else {
                 return "Idioma invalido";
                }
            default :
                return("MES INVALIDO");
                
                
    }
}

    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
         
           System.out.print("Digite o Numero do mes: ");
           int valor1 = input.nextInt();
           System.out.print("Digite 1PORTUGUES  2INGLES: ");
           int valor2 = input.nextInt();
            
        System.out.println("Resultado "+getMesPorExtenso(valor1,valor2));
        
    }
}
