/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edward.apache.service;

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
public class mathTest {
    
    public mathTest() {
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
     * Test of calcDiscriminante method, of class math.
     */
    @Test
    public void testCalcDiscriminante() {
        System.out.println("calcDiscriminante");
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        math instance = new math();
        double expResult = 0.0;
        double result = instance.calcDiscriminante(a, b, c);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcX1 method, of class math.
     */
    @Test
    public void testCalcX1() {
        System.out.println("calcX1");
        double d = 0.0;
        double b = 0.0;
        double a = 0.0;
        math instance = new math();
        double expResult = 0.0;
        double result = instance.calcX1(d, b, a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcX2 method, of class math.
     */
    @Test
    public void testCalcX2() {
        System.out.println("calcX2");
        double discriminante = 0.0;
        double b = 0.0;
        double a = 0.0;
        math instance = new math();
        double expResult = 0.0;
        double result = instance.calcX2(discriminante, b, a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcCondicion method, of class math.
     */
    @Test
    public void testCalcCondicion() {
        System.out.println("calcCondicion");
        double d = 0.0;
        math instance = new math();
        String expResult = "";
        String result = instance.calcCondicion(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
