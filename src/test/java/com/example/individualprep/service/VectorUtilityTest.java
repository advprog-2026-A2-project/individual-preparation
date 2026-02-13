package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for {@link VectorUtility}.
 */
public class VectorUtilityTest {
    /**Arithmetic utility under test.*/
    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        /* Arithmetic utility under test. */
        vectorUtility = new VectorUtility();
    }

    @SuppressWarnings("checkstyle:MagicNumber")
    @Test
    void multiplyTest() {
        double[] vector1 = {2.0, 3.0, 4.0, 5.0};
        double[] vector2 = {-2.0, -3.0, -4.0, -5.0};
        int num1 = 6;
        int num2 = -7;
        double[] result1 = {12.0, 18.0, 24.0, 30.0};
        double[] result2 = {-14.0, -21.0, -28.0, -35.0};
        double[] result3 = {14.0, 21.0, 28.0, 35.0};

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.multiply(null, num1));
        assertArrayEquals(result1, vectorUtility.multiply(vector1, num1));
        assertArrayEquals(result2, vectorUtility.multiply(vector1, num2));
        assertArrayEquals(result3, vectorUtility.multiply(vector2, num2));

    }
}
