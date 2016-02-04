package com.Amber;

/**
 * Created by Amber on 2/4/2016.
 */
public class Main {
    public static void main(String[] args) {

        String Day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int HighTemp[] ={45,29,10,22,21,28,33};
        int Percip[] = {95,25,5,0,75,90};

        for(int i=0; i< Day.length; i++)
        {
            if((HighTemp[i] <= 32) && (Percip[i] > 50))
            {
                System.out.println(Day[i]);
            }
        }



    }

}
