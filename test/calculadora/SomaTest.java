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
public class SomaTest {
    
    public SomaTest() {
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
     * Test of SomarDoisNumerosInteiros method, of class Soma.
     */
    @Test
    public void testSomarDoisNumerosInteiros() {
        System.out.println("SomarDoisNumerosInteiros");
        int numero1 = 0;
        int numero2 = 0;
        Soma instance = new Soma();
        int expResult = 0;
        int result = instance.SomarDoisNumerosInteiros(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SomarDoisNumerosAoQuadrado method, of class Soma.
     */
    @Test
    public void testSomarDoisNumerosAoQuadrado() {
        System.out.println("SomarDoisNumerosAoQuadrado");
        int n1 = 0;
        int n2 = 0;
        Soma instance = new Soma();
        int expResult = 0;
        int result = instance.SomarDoisNumerosAoQuadrado(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SomarDuasFrações method, of class Soma.
     */
    @Test
    public void testSomarDuasFrações() {
        System.out.println("SomarDuasFra\u00e7\u00f5es");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        Soma instance = new Soma();
        double expResult = 0.0;
        double result = instance.SomarDuasFrações(n1, n2, n3, n4);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
