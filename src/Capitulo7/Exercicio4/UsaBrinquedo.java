/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author talis
 */
public class UsaBrinquedo {

    public static void main(String[] args) {

        Brinquedo usaBrinquedo = new Brinquedo();
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Digite Sua Categoria: \nDE_0_A_2_ANOS,\nDE_3_A_5_ANOS,\nDE_6_A_10_ANOS,\nACIMA_DE_10. \n\nCategoria: ");
        String idade = input.nextLine();
        FaixaEtaria.valueOf(idade);

        System.out.print("Quer Comprando uma TV  ___  s / n  : ");
        char resposta = input.next().charAt(0);

        if (resposta == 's') {

            System.out.println("Digite Quanto quer Pagar: ");
            float preco = input.nextFloat();

            usaBrinquedo = new Brinquedo(nome, preco);
        } else {

            usaBrinquedo = new Brinquedo(nome);
        }

        System.out.println("-----------------------------------------------------");
        usaBrinquedo.mostrar();

    }

}
