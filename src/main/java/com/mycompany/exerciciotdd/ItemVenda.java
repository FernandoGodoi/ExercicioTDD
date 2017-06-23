/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciotdd;

/**
 *
 * @author Aluno
 */
public class ItemVenda {     
    private Produto produto;
    private int quantidade;
    private double desconto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public ItemVenda(Produto produto, int quantidade, double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
    public double getTotal(){
        return quantidade*produto.getPreco();
    }
}