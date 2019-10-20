/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

import java.util.Scanner;

/**
 *
 * @author talis
 */
public class UsaRobo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Robo usaRobo = new Robo();
        char resposta;

        System.out.println("1_ Andar\n2_ Virar\n3_ Falar");
        System.out.print("Digite um valor Acima para Ordenar o ROBO:");

        do {
            int fazer = input.nextInt();

            if (fazer == 1) {

                usaRobo.getAndar();
            } else if (fazer == 2) {

                usaRobo.getVirar();
            } else if (fazer == 3) {

                usaRobo.getFalar();
            } else {

                System.err.println("ERRO DE DADOS");
            }

            System.out.print("Continuar?? s/n:  ");
            resposta = input.next().charAt(0);

        } while (resposta != 'n');
    }

}
