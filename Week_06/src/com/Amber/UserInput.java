package com.Amber;

import java.util.*;
/**
 * Created by Amber on 2/25/2016.
 */
public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) throws NumberFormatException
    {
        System.out.println(message);
        String userInput = scanner.nextLine();
        int userInt =0;
        boolean isInt = false;
        while(!isInt)
        {
            try
            {
                userInt = Integer.parseInt(userInput);
                isInt =true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(userInput + " is not an integer. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userInt;
    }
    public double promptDouble(String message) throws NumberFormatException
    {
        System.out.println(message);
        String userInput = scanner.nextLine();
        double userDoub =0;
        boolean isDouble = false;
        while(!isDouble)
        {
            try
            {
                userDoub = Double.parseDouble(userInput);
                isDouble =true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(userInput + " is not a Double. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userDoub;
    }

    public String promptString(String message) throws NumberFormatException
    {
        System.out.println(message);
        String userInput = scanner.nextLine();
        return userInput;

    }
}
