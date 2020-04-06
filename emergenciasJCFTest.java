/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class emergenciasJCFTest {
    
    public emergenciasJCFTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class emergenciasJCF.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object value = null;
        emergenciasJCF instance = new emergenciasJCF();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class emergenciasJCF.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        emergenciasJCF instance = new emergenciasJCF();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class emergenciasJCF.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        Object value = null;
        emergenciasJCF instance = new emergenciasJCF();
        String expResult = "";
        String result = instance.check(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
