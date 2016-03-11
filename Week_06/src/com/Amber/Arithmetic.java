package com.Amber;

/**
 * Created by Amber on 2/25/2016.
 */
public class Arithmetic {
    public static double avg(double[] values) throws Exception {
        if (values.length == 0) {
            throw new Exception("Cannot Divide By Zero");
        }
        double avg = 0;

        for (double value : values) {
            avg += value;
        }
        return avg / values.length;
    }

    public static int division(int a, int b)
    {
        return a/b;
    }
}
