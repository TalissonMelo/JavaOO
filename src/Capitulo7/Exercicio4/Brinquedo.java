/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author talis
 */
public class Brinquedo {

    private String nome;
    private FaixaEtaria faixaEtaria;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Brinquedo() {

    }

    public Brinquedo(String nome) {

        this.nome = nome;
    }

    public Brinquedo(String nome, float preco) {

        this.nome = nome;
        this.preco = preco;
    }

    public Brinquedo(String nome, FaixaEtaria faixaEtaria, float preco) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
        this.preco = preco;
    }

    

    
    public void mostrar() {

        System.out.println("Nome: "
                + nome
                + ", Preço R$: "
                + String.format("%.2f", preco));
    }

}
