package com.Amber;

/**
 * Created by Amber on 2/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");

        String CityName ="Columbus";
        int zip = 43215;
        int[] HighTemp = {32, 25, 27, 40, 45};

        double AvgHigh = (HighTemp[0] + HighTemp[1] + HighTemp [2] +HighTemp[3] + HighTemp[4]) / 5.0;

        System.out.println("City: " + CityName);
        System.out.println("Zip Code: " + zip);
        System.out.println("High Temperature Average: " + AvgHigh);



    }

}
