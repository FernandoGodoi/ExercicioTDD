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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getCodigo method, of class Produto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Produto instance = null;
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Produto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Produto instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class Produto.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Produto instance = null;
        String expResult = "";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesc method, of class Produto.
     */
    @Test
    public void testSetDesc() {
        System.out.println("setDesc");
        String desc = "";
        Produto instance = null;
        instance.setDesc(desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class Produto.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Produto instance = null;
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class Produto.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        double preco = 0.0;
        Produto instance = null;
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
