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
public class SubtraçãoTest {
    
    public SubtraçãoTest() {
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
     * Test of SubtrairInteiros method, of class Subtração.
     */
    @Test
    public void testSubtrairInteiros() {
        System.out.println("SubtrairInteiros");
        int n1 = 0;
        int n2 = 0;
        Subtração instance = new Subtração();
        int expResult = 0;
        int result = instance.SubtrairInteiros(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SubtrairDoisNumeroAoQuadrado method, of class Subtração.
     */
    @Test
    public void testSubtrairDoisNumeroAoQuadrado() {
        System.out.println("SubtrairDoisNumeroAoQuadrado");
        int n1 = 0;
        int n2 = 0;
        Subtração instance = new Subtração();
        int expResult = 0;
        int result = instance.SubtrairDoisNumeroAoQuadrado(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SubtrairFrações method, of class Subtração.
     */
    @Test
    public void testSubtrairFrações() {
        System.out.println("SubtrairFra\u00e7\u00f5es");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        Subtração instance = new Subtração();
        double expResult = 0.0;
        double result = instance.SubtrairFrações(n1, n2, n3, n4);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
