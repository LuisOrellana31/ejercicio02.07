/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.est.modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author domem
 */
public class Historial_ClinicaIT {
    
    public Historial_ClinicaIT() {
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
     * Test of getCodigo_historial method, of class Historial_Clinica.
     */
    @Test
    public void testGetCodigo_historial() {
        System.out.println("getCodigo_historial");
        Historial_Clinica instance = null;
        int expResult = 0;
        int result = instance.getCodigo_historial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo_historial method, of class Historial_Clinica.
     */
    @Test
    public void testSetCodigo_historial() {
        System.out.println("setCodigo_historial");
        int codigo_historial = 0;
        Historial_Clinica instance = null;
        instance.setCodigo_historial(codigo_historial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Historial_Clinica.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Historial_Clinica instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Historial_Clinica.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Historial_Clinica instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Historial_Clinica.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Historial_Clinica instance = null;
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Historial_Clinica.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Historial_Clinica instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class Historial_Clinica.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        Historial_Clinica instance = null;
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class Historial_Clinica.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Paciente paciente = null;
        Historial_Clinica instance = null;
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
