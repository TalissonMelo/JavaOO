/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

import java.util.Scanner;

/**
 *
 * @author talis
 */
public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pontos Lider: ");
        int lider = input.nextInt();

        System.out.print("Pontos Lanterna: ");
        int lanterna = input.nextInt();

        int resultado = (lider - lanterna) / 3;

        System.out.println("Número de vitórias necessárias: " + resultado);

        input.close();
    }

}
