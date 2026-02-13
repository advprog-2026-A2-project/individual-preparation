package com.example.individualprep.service;

import org.springframework.stereotype.Service;

/**
 * Utility class for vector operations.
 */
@Service
public final class VectorUtility {

    /**
     * Adds two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @return result of addition
     */
    public double[] add(final double[] v1, final double[] v2) {
        return new double[] {0.0, 0.0, 0.0};
    }

    public double[] subtract(double[] v1, double[] v2) {
        double[]hasil= new double[v1.length];
        for (int i=0; i<v1.length;i++){
            hasil[i]=v1[i]-v2[i];
        }
        return hasil;
    }

    /**
     * Multiplies a vector by a scalar.
     * @param v1 the vector
     * @param x the scalar
     * @return result of multiplication
     */
    public double[] multiply(final double[] v1, final int x) {
        return new double[] {0.0, 0.0, 0.0};
    }

    /**
     * Computes the dot product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @return the dot product result
     */
    public double dotProduct(final double[] v1, final double[] v2) {
        return 0.0;
    }

    /**
     * Computes the norm of a vector.
     * @param v1 the vector
     * @return the norm value
     */
    public double norm(final double[] v1) {
        return 0.0;
    }
}