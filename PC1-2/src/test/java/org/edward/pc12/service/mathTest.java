package org.edward.pc12.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mathTest {

    @Test
    void serie() {
        math m = new math();
        double actual = math.serie(2,2);

        assertAll(
                ()->assertEquals(-1,actual)
        );

    }
}