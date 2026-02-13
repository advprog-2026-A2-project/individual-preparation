package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link ArithmeticUtility}.
 */
final class ArithmeticUtilityTest {

    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp() {
        /* Arithmetic utility under test. */
        arithmeticUtility = new ArithmeticUtility();
    }

    @SuppressWarnings("checkstyle:MagicNumber")
    @Test
    void multiplyTest() {
        /*first positive number*/
        double num1 = 2.0;
        /*second positive number*/
        double num2 = 3.0;
        /*first negative number*/
        double num3 = -4.0;
        /*second negative number*/
        double num4 = -5.0;
        double result1 = num1 * num2;
        double result2 = num2 * num3;
        double result3 = num3 * num4;

        assertEquals(result1, arithmeticUtility.multiply(num1, num2));
        assertEquals(result2, arithmeticUtility.multiply(num2, num3));
        assertEquals(result3, arithmeticUtility.multiply(num3, num4));
    }
}
