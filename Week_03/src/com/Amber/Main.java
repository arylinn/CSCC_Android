package com.Amber;

/**
 * Created by Amber on 2/4/2016.
 */
public class Main {
    static void tempConversion(double Celsius) {
        final String degree  = "\u00b0";
        double F = 9.0/5 * Celsius + 32;
        System.out.println(Celsius + degree + " C is " + F + degree + " F.");

    }


    public static void main(String[] args) {
        double CelsiusTemp = 37;
        tempConversion(CelsiusTemp);


    }
}

