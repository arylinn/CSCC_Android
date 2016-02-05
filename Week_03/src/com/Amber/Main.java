package com.Amber;

import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * Created by Amber on 2/4/2016.
 * VCS -> GIT -> COMMITFILE -> CHOOSE FILE
 */

public class Main {
    static double UserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a Fahrenheit temperature between 0 and -460 ");
        String input = scanner.nextLine();
        return Double.parseDouble(input);

    }

    static double Convert(double FTemp) {
        return 5.0 / 9 * (FTemp - 32);
    }

    static void Display(double CTemp) {
        NumberFormat format = NumberFormat.getInstance();
        format.setRoundingMode(RoundingMode.UP);
        format.setMaximumFractionDigits(2);
        final String degree = "\u00b0";
        System.out.println("The Celsius Temperature is " + format.format(CTemp) + degree);
    }

    public static void main(String[] args) {
        double FTemp = UserInput();
        while (FTemp >= -460) {
            double CTemp = Convert(FTemp);
            Display(CTemp);
            FTemp = UserInput();
        }
    }
}

