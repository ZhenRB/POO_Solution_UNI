/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edward.pc1ejercicio1.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javie
 */
public class fechaServiceTest {
    
    public fechaServiceTest() {
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
     * Test of validacionFecha method, of class fechaService.
     */
    @Test
    public void testValidacionFecha() {
        System.out.println("validacionFecha");
        int dia = 0;
        int mes = 0;
        int año = 0;
        fechaService instance = new fechaService();
        String expResult = "";
        String result = instance.validacionFecha(dia, mes, año);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fechaServicemestre method, of class fechaService.
     */
    @Test
    public void testFechaServicemestre() {
        System.out.println("fechaServicemestre");
        int mes = 0;
        String expResult = "";
        String result = fechaService.fechaServicemestre(mes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarEstacion method, of class fechaService.
     */
    @Test
    public void testEncontrarEstacion() {
        System.out.println("encontrarEstacion");
        int día = 0;
        int mes = 0;
        fechaService instance = new fechaService();
        String expResult = "";
        String result = instance.encontrarEstacion(día, mes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
