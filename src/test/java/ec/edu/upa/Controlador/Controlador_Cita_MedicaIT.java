/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.upa.Controlador;

import ec.edu.ups.est.modelo.CitaMedicaIT;
import java.util.List;
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
public class Controlador_Cita_MedicaIT {
    
    public Controlador_Cita_MedicaIT() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }


    /**
     * Test of crear method, of class Controlador_Cita_Medica.
     */
    @org.junit.jupiter.api.Test
    public void testCrear() {
        System.out.println("crear");
        CitaMedicaIT citaMedica = null;
        Controlador_Cita_MedicaIT instance = new Controlador_Cita_MedicaIT();
        instance.crear(citaMedica);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class Controlador_Cita_Medica.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
        System.out.println("buscar");
        int codigo = 0;
        Controlador_Cita_Medica instance = new Controlador_Cita_Medica();
        CitaMedica expResult = null;
        CitaMedica result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Controlador_Cita_Medica.
     */
    @org.junit.jupiter.api.Test
    public void testEliminar() {
        System.out.println("eliminar");
        int codigo = 0;
        Controlador_Cita_MedicaIT instance = new Controlador_Cita_MedicaIT();
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCitaMedicaList method, of class Controlador_Cita_Medica.
     */
//    @org.junit.jupiter.api.Test
//    public void testGetCitaMedicaList() {
//        System.out.println("getCitaMedicaList");
//        Controlador_Cita_Medica instance = new Controlador_Cita_Medica();
//        List<CitaMedica> expResult = null;
//        List<CitaMedica> result = instance.getCitaMedicaList();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
//    }
    
}
