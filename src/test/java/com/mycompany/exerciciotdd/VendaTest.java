/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciotdd;

import java.util.Date;
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
public class VendaTest {
    
    public VendaTest() {
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
     * Test of adicionaItemVenda method, of class Venda.
     */
    @Test
    public void testAdicionaItemVenda() {
        System.out.println("adicionaItemVenda");
        ItemVenda item = null;
        Venda instance = null;
        instance.adicionaItemVenda(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Venda.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Venda instance = null;
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Venda.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Date data = null;
        Venda instance = null;
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Venda.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Venda instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Venda.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Venda instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
