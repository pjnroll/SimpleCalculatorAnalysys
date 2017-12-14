package org.farfallettalaviano.simplecalculator.utils;

import org.junit.Test;

import static java.lang.Math.E;
import static org.junit.Assert.*;

/**
 * Created by stefa on 12/12/2017.
 */
public class OperationsTest {
    private final static double delta = E-8d;   // it matches with the epsilon-machine

    @Test
    public void sumTest(){
        assertEquals(4.0d, Operations.add(2.0d,2.0d), delta);
        assertEquals(0.0d, Operations.add(2.0d,-2.0d), delta);
        assertEquals(0.0d, Operations.add(-2.0d,2.0d), delta);
        assertEquals(-4.0d, Operations.add(-2.0d, -2.0d), delta);
    }

    @Test(expected = NumberFormatException.class)
    public void testNumberFormatException() {
        Operations.divide(1.0d, 0.0d);
    }

    @Test
    public void subTest(){
        assertEquals(10.48d, Operations.subtract(22.68d, 12.20d), delta);
        assertEquals(0.0025d,  Operations.subtract(1.0025d, 1.0d), delta);
    }

    @Test
    public void mulTest(){
        assertEquals(5d, Operations.multiply(2.5d, 2d), delta);
    }

    @Test
    public void divTest(){
        assertEquals(5.0d, Operations.divide(10d, 2d), delta);
        assertEquals(18.27777778d, Operations.divide(658.0d, 36.0d), delta);
        assertEquals(17.151086d, Operations.divide(625.26d, 36.456d), delta);
    }
}