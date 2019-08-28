/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20161064010037
 */
public class MultiplicaçãoTest {
    
    public MultiplicaçãoTest() {
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
     * Test of MultiplicarDuasFrações method, of class Multiplicação.
     */
    @Test
    public void testMultiplicarDuasFrações() {
        System.out.println("MultiplicarDuasFra\u00e7\u00f5es");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        Multiplicação instance = new Multiplicação();
        int expResult = 0;
        int result = instance.MultiplicarDuasFrações(n1, n2, n3, n4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicardoisnumeroaoquadrado method, of class Multiplicação.
     */
    @Test
    public void testMultiplicardoisnumeroaoquadrado() {
        System.out.println("Multiplicardoisnumeroaoquadrado");
        int n1 = 0;
        int n2 = 0;
        Multiplicação instance = new Multiplicação();
        int expResult = 0;
        int result = instance.Multiplicardoisnumeroaoquadrado(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MultiplicarNumerosInteiros method, of class Multiplicação.
     */
    @Test
    public void testMultiplicarNumerosInteiros() {
        System.out.println("MultiplicarNumerosInteiros");
        int n1 = 0;
        int n2 = 0;
        Multiplicação instance = new Multiplicação();
        int expResult = 0;
        int result = instance.MultiplicarNumerosInteiros(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
