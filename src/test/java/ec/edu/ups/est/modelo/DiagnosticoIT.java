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
public class DiagnosticoIT {
    
    public DiagnosticoIT() {
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
     * Test of toString method, of class Diagnostico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Diagnostico instance = new Diagnostico();
        String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Diagnostico.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Diagnostico instance = new Diagnostico();
        int expResult = 0;
        int result = instance.getCodigo();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Diagnostico.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Diagnostico instance = new Diagnostico();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Diagnostico.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Diagnostico instance = new Diagnostico();
        String expResult = "";
        String result = instance.getDescripcion();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Diagnostico.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Diagnostico instance = new Diagnostico();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOrden method, of class Diagnostico.
     */
//    @Test
//    public void testGetOrden() {
//        System.out.println("getOrden");
//        Diagnostico instance = new Diagnostico();
//        TipoOrden expResult = null;
//        TipoOrden result = instance.getOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOrden method, of class Diagnostico.
//     */
//    @Test
//    public void testSetOrden() {
//        System.out.println("setOrden");
//        TipoOrden orden = null;
//        Diagnostico instance = new Diagnostico();
//        instance.setOrden(orden);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    //}
    
}
