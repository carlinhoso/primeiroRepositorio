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
public class CadastroTest {
    
    public CadastroTest() {
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
     * Test of Aluno method, of class Cadastro.
     */
    @Test
    public void testAluno() {
        System.out.println("Aluno");
        String nome = "";
        int idade = 0;
        Cadastro.Aluno(nome, idade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Servidor method, of class Cadastro.
     */
    @Test
    public void testServidor() {
        System.out.println("Servidor");
        String nome = "";
        String profissão = "";
        Cadastro.Servidor(nome, profissão);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Visitante method, of class Cadastro.
     */
    @Test
    public void testVisitante() {
        System.out.println("Visitante");
        String nome1 = "";
        String localDeOrigem = "";
        Cadastro.Visitante(nome1, localDeOrigem);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
