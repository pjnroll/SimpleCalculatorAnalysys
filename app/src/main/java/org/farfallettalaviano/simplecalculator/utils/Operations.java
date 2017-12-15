package org.farfallettalaviano.simplecalculator.utils;

import java.math.BigDecimal;

/**
 * Created by stefa on 12/12/2017.
 */

public class Operations {
    private final static int em = 8;   // em = epsilon-machine (precision)

    public static double add(double a, double b) {
        double r = a + b;
        BigDecimal bd = new BigDecimal(r);
        bd = bd.setScale(em, BigDecimal.ROUND_HALF_UP);

        return bd.doubleValue();
    }

    public static double subtract (double a, double b) {
        double r = a - b;
        BigDecimal bd = new BigDecimal(r);
        bd = bd.setScale(em, BigDecimal.ROUND_HALF_UP);

        return bd.doubleValue();
    }

    public static double multiply (double a, double b) {
        double r = a * b;
        BigDecimal bd = new BigDecimal(r);
        bd = bd.setScale(em, BigDecimal.ROUND_HALF_UP);

        return bd.doubleValue();
    }

    public static double divide (double a, double b) throws NumberFormatException {
        double r = a / b;
        BigDecimal bd = new BigDecimal(r);
        bd = bd.setScale(em, BigDecimal.ROUND_HALF_UP);

        return bd.doubleValue();
    }

    public static double elevation(double a, double b) {
        return Math.pow(a, b);
    }
}