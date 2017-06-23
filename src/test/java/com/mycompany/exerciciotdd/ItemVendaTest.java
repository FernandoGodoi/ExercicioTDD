/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciotdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class ItemVendaTest {
    
    public ItemVendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProduto method, of class ItemVenda.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        ItemVenda instance = null;
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduto method, of class ItemVenda.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        ItemVenda instance = null;
        instance.setProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class ItemVenda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        ItemVenda instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class ItemVenda.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        ItemVenda instance = null;
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesconto method, of class ItemVenda.
     */
    @Test
    public void testGetDesconto() {
        System.out.println("getDesconto");
        ItemVenda instance = null;
        double expResult = 0.0;
        double result = instance.getDesconto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesconto method, of class ItemVenda.
     */
    @Test
    public void testSetDesconto() {
        System.out.println("setDesconto");
        double desconto = 0.0;
        ItemVenda instance = null;
        instance.setDesconto(desconto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class ItemVenda.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        ItemVenda instance = null;
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
