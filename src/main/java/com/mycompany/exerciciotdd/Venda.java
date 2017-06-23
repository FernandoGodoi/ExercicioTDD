/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciotdd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Venda {
    private Date data;
    private int numero;
    private List<ItemVenda> itens;

    public Venda(Date data, int numero) {
        this.data = data;
        this.numero = numero;
        itens= new ArrayList<>();
    }
    
    public void adicionaItemVenda(ItemVenda item){
        for (ItemVenda itemvenda : itens){
            
        }
    }
    
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
