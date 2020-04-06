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
public class pacienteTest {
    
    public pacienteTest() {
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
     * Test of id method, of class paciente.
     */
    @Test
    public void testId() {
        System.out.println("id");
        paciente instance = new paciente();
        String expResult = "";
        String result = instance.id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignar method, of class paciente.
     */
    @Test
    public void testAsignar() {
        System.out.println("asignar");
        String nombre = "";
        paciente instance = new paciente();
        instance.asignar(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluo method, of class paciente.
     */
    @Test
    public void testEvaluo() {
        System.out.println("evaluo");
        paciente instance = new paciente();
        String expResult = "";
        String result = instance.evaluo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diagnostico method, of class paciente.
     */
    @Test
    public void testDiagnostico() {
        System.out.println("diagnostico");
        String afeccion = "";
        paciente instance = new paciente();
        instance.diagnostico(afeccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of status method, of class paciente.
     */
    @Test
    public void testStatus() {
        System.out.println("status");
        paciente instance = new paciente();
        String expResult = "";
        String result = instance.status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizacion method, of class paciente.
     */
    @Test
    public void testActualizacion() {
        System.out.println("actualizacion");
        String grado = "";
        paciente instance = new paciente();
        instance.actualizacion(grado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class paciente.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        paciente o = null;
        paciente instance = new paciente();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class paciente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        paciente instance = new paciente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
