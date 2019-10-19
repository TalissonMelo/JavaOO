/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo3;

import javax.swing.JOptionPane;

/**
 *
 * @author talis
 */
public class Exercicio05 {

    public static void main(String[] args) {

        String name = "";
        int escolha;

        name = JOptionPane.showInputDialog(null, "Digite uma Opção: \n1-Exercicio 1\n2-Exercicio 2\n3-Exercicio 3\n4-Exercicio 4");
        escolha = Integer.parseInt(name);

        switch (escolha) {

            case 1:
                float valorProduto = 0,
                 descontoProduto = 0;

                String nome = JOptionPane.showInputDialog("Nome do produto: ");
                valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto: "));

                if (valorProduto < 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                } else if (valorProduto >= 50 && valorProduto < 200) {
                    descontoProduto = valorProduto - ((valorProduto * 5) / 100);
                } else if (valorProduto >= 200 && valorProduto < 500) {
                    descontoProduto = valorProduto - ((valorProduto * 6) / 100);
                } else if (valorProduto >= 500 && valorProduto < 1000) {
                    descontoProduto = valorProduto - ((valorProduto * 7) / 100);
                } else if (valorProduto >= 1000) {
                    descontoProduto = valorProduto - ((valorProduto * 8) / 100);
                }

                JOptionPane.showMessageDialog(null, "Produto : " + nome + "\nValor Original : " + valorProduto + "\nValor com Desconto: " + descontoProduto);

                break;
            case 2:

                int i;
                int soma = 0,
                 maior = 0,
                 menor = 1000000000;
                int[] resistencia = new int[4];

                for (i = 0; i < resistencia.length; i++) {

                    resistencia[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "ª Resistencia: "));
                    soma += resistencia[i];
                }
                for (i = 0; i < resistencia.length; i++) {

                    if (resistencia[i] > maior) {

                        maior = resistencia[i];
                    }

                    if (resistencia[i] < menor) {

                        menor = resistencia[i];
                    }

                }

                JOptionPane.showMessageDialog(null, "Resistências Fornecidas: \n" + resistencia[0]
                        + "," + resistencia[1]
                        + "," + resistencia[2]
                        + "," + resistencia[3]
                        + "\nMaior Resisência: " + maior
                        + "\nMenor Resistência: " + menor
                        + "\nResistência Equivalente: " + soma);

                break;
            case 3:
                final String user = "java8";
                final String password = "java8";
                int tentativas = 3;
                String usuario,
                 senha;
                do {
                    usuario = JOptionPane.showInputDialog("Usuario");
                    senha = JOptionPane.showInputDialog("Senha");

                    if (!user.equals(usuario) || !password.equals(senha)) {
                        tentativas--;
                        JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\nVocê tem mais " + tentativas + " tentativas.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Login e senha aceitos!!!");
                    }
                } while (tentativas > 0 && (!user.equals(usuario) || !password.equals(senha)));
                break;
            case 4:
                int cont,
                 numero;
                name = JOptionPane.showInputDialog("Digite o numero para Tabuada: ");
                numero = Integer.parseInt(name);
                String resultado = "";

                for (cont = 0; cont < 11; cont++) {

                    resultado += numero + " X " + cont + " = " + (numero * cont) + "\n";

                }

                JOptionPane.showMessageDialog(null, resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "VALOR INVALIDO!");
        }
    }

}
