package org.practices.edward.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class formulaGeneralTest {

    @Test
    @DisplayName("Discriminante")
    void calcDiscriminante() {
        formulaGeneral f = new formulaGeneral();
        double d = f.calcDiscriminante(1,-2,1);
        assertAll(
                ()-> assertEquals(0, d ,"Valor correcto"),
                ()-> assertEquals(1, d+1 ,"Valor incorrecto")
        );
    }

    @Test
    @DisplayName("Calcular x1")
    void calcX1() {
        formulaGeneral f = new formulaGeneral();
        double x1 = f.calcX1(0,-2,1);
        assertEquals(1,x1);
        System.out.println("Valor esperado: 1");
        System.out.println("Valor obtenido: " + x1);
    }

    @Test
    @DisplayName("Calcular x2")
    void calcX2() {
        formulaGeneral f = new formulaGeneral();
        double x2 = f.calcX2(0,-2,1);
        assertEquals(1,x2);
        System.out.println("Valor esperado: 0");
        System.out.println("Valor obtenido: " + x2);
    }

    @Test
    @DisplayName("Condición")
    void calcCondicion() {

        formulaGeneral f = new formulaGeneral();
        String d = f.calcCondicion(-1);
        assertEquals("No tiene raíces",d);
        System.out.println("Valor esperado: No tiene raíces");
        System.out.println("Valor obtenido: " + d);
    }
}