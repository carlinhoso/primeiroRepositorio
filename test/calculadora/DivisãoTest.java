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
public class DivisãoTest {
    
    public DivisãoTest() {
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
     * Test of DividirFrações method, of class Divisão.
     */
    @Test
    public void testDividirFrações() {
        System.out.println("DividirFra\u00e7\u00f5es");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        Divisão instance = new Divisão();
        double expResult = 0.0;
        double result = instance.DividirFrações(n1, n2, n3, n4);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of DividirInteiros method, of class Divisão.
     */
    @Test
    public void testDividirInteiros() {
        System.out.println("DividirInteiros");
        int n1 = 0;
        int n2 = 0;
        Divisão instance = new Divisão();
        double expResult = 0.0;
        double result = instance.DividirInteiros(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of DividirAoQuadrado method, of class Divisão.
     */
    @Test
    public void testDividirAoQuadrado() {
        System.out.println("DividirAoQuadrado");
        int n1 = 0;
        int n2 = 0;
        Divisão instance = new Divisão();
        double expResult = 0.0;
        double result = instance.DividirAoQuadrado(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
