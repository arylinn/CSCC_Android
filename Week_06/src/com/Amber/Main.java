package com.Amber;

/**
 * Created by Amber on 2/25/2016.
 */
public class Main {
    public static void main (String[] args) {

           UserInput input = new UserInput();
           double aNum = input.promptDouble("Enter a Double");
        System.out.println("Twice your number is: " + 2*aNum);

    }
}
