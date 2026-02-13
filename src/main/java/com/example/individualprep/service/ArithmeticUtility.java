package com.example.individualprep.service;

import org.springframework.stereotype.Service;

/**
 * Utility class for performing arithmetic operations.
 * This class provides methods for addition, subtraction, multiplication,
 * division, and exponentiation.
 */
@Service
public final class ArithmeticUtility {

    /**
     * Adds two numbers.
     *
     * @param o1 the first operand
     * @param o2 the second operand
     * @return the sum of o1 and o2
     */
    public double add(final double o1, final double o2) {
        return 0.0;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param o1 the first operand
     * @param o2 the second operand
     * @return the difference when o2 is subtracted from o1
     */
    public double subtract(final double o1, final double o2) {
        return 0.0;
    }

    /**
     * Multiplies two numbers.
     *
     * @param o1 the first operand
     * @param o2 the second operand
     * @return the product of o1 and o2
     */
    public double multiply(final double o1, final double o2) {
        return o1 * o2;
    }

    /**
     * Divides the first number by the second.
     *
     * @param o1 the dividend
     * @param o2 the divisor
     * @return the result of the division, or 0.0 if the divisor is 0
     */
    public double divide(final double o1, final double o2) {
        if (o2 == 0) {
            return 0.0;
        }
        return o1 / o2;
    }

    /**
     * Raises the base to the power of the exponent.
     *
     * @param o1 the base number
     * @param n  the exponent
     * @return the result of o1 raised to the power of n
     */
    public double exponent(final double o1, final int n) {
        return 0.0;
    }
}
