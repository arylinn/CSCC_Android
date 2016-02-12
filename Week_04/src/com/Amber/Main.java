package com.Amber;

import java.util.*;

/**
 * Created by Amber on 2/11/2016.
 */

public class Main {
    static void DisplayAvg(Map<String, Double> avg) {
        for (String key : avg.keySet()) {
            System.out.println(key + ": " + avg.get(key));
        }
    }

    static Map<String, Double> CalculateAvg(Map<String, List<Double>> DailyTemps)
    {
        Map<String, Double> avg = new TreeMap<>();
        for (String city: DailyTemps.keySet())
        {
            List<Double> temps = DailyTemps.get(city);
            double total = 0;
            for(double temp: temps)
            {
                total += temp;

            }
            total /= temps.size();
            avg.put(city, total);
        }
        return avg;
    }

    static Map<String, List<Double>> Input ()
    {
        Map<String, List<Double>> CityTemps = new TreeMap<>();
        List<String> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A City Name, type END when finished: ");
        String city = scanner.nextLine();

        while(!city.equals("END") )
        {
            cities.add(city);
            city = scanner.nextLine();
        }
        for(String CityName: cities)
        {
            System.out.println("Enter the temperature for the next five days for " + CityName + " *seperate with space*");
            String input = scanner.nextLine();
            String[] StringTemps = input.split(" ");

            List<Double> DTemps = new ArrayList<>();
            for(String temps: StringTemps)
            {
               DTemps.add(Double.parseDouble(temps));
            }
            CityTemps.put(CityName, DTemps);
        }
        return CityTemps;
    }

    public static void main (String[] args)
    {
        Map<String, List<Double>> UserInput = Input();
        Map<String, Double> avg = CalculateAvg(UserInput);
        DisplayAvg(avg);

    }

}
