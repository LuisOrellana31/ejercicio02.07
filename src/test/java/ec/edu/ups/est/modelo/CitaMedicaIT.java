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
public class CitaMedicaIT {
    
    public CitaMedicaIT() {
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
     * Test of getCita_codigo method, of class CitaMedica.
     */
    @Test
    public void testGetCita_codigo() {
        System.out.println("getCita_codigo");
        CitaMedica instance = null;
        int expResult = 0;
        int result = instance.getCita_codigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_codigo method, of class CitaMedica.
     */
    @Test
    public void testSetCita_codigo() {
        System.out.println("setCita_codigo");
        int cita_codigo = 0;
        CitaMedica instance = null;
        instance.setCita_codigo(cita_codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCita_fecha method, of class CitaMedica.
     */
    @Test
    public void testGetCita_fecha() {
        System.out.println("getCita_fecha");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.getCita_fecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_fecha method, of class CitaMedica.
     */
    @Test
    public void testSetCita_fecha() {
        System.out.println("setCita_fecha");
        String cita_fecha = "";
        CitaMedica instance = null;
        instance.setCita_fecha(cita_fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCita_hora method, of class CitaMedica.
     */
    @Test
    public void testGetCita_hora() {
        System.out.println("getCita_hora");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.getCita_hora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_hora method, of class CitaMedica.
     */
    @Test
    public void testSetCita_hora() {
        System.out.println("setCita_hora");
        String cita_hora = "";
        CitaMedica instance = null;
        instance.setCita_hora(cita_hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCita_motivo method, of class CitaMedica.
     */
    @Test
    public void testGetCita_motivo() {
        System.out.println("getCita_motivo");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.getCita_motivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_motivo method, of class CitaMedica.
     */
    @Test
    public void testSetCita_motivo() {
        System.out.println("setCita_motivo");
        String cita_motivo = "";
        CitaMedica instance = null;
        instance.setCita_motivo(cita_motivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico method, of class CitaMedica.
     */
    @Test
    public void testGetMedico() {
        System.out.println("getMedico");
        CitaMedica instance = null;
        Medico expResult = null;
        Medico result = instance.getMedico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico method, of class CitaMedica.
     */
    @Test
    public void testSetMedico() {
        System.out.println("setMedico");
        Medico medico = null;
        CitaMedica instance = null;
        instance.setMedico(medico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class CitaMedica.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        CitaMedica instance = null;
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class CitaMedica.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Paciente paciente = null;
        CitaMedica instance = null;
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
