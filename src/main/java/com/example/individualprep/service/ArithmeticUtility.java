package com.example.individualprep.service;

import org.springframework.stereotype.Service;

/**
 * Utility class for arithmetic operations.
 */
@Service
public final class ArithmeticUtility {

    /**
     * Adds two numbers.
     * @param o1 first number
     * @param o2 second number
     * @return result of addition
     */
    public double add(final double o1, final double o2) {
        return 0.0;
    }

    /**
     * Subtracts two numbers.
     * @param o1 first number
     * @param o2 second number
     * @return result of subtraction
     */
    public double subtract(final double o1, final double o2) {
        return 0.0;
    }

    /**
     * Multiplies two numbers.
     * @param o1 first number
     * @param o2 second number
     * @return result of multiplication
     */
    public double multiply(final double o1, final double o2) {
        return 0.0;
    }

    /**
     * Divides two numbers.
     * @param o1 first number
     * @param o2 second number
     * @return result of division
     * @throws ArithmeticException if dividing by zero
     */
    public double divide(final double o1, final double o2) {
        if (o2 == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return o1 / o2;
    }

    /**
     * Computes the exponentiation of a number.
     * @param o1 base
     * @param n exponent
     * @return result of exponentiation
     */
    public double exponent(final double o1, final int n) {
        return 0.0;
    }
}