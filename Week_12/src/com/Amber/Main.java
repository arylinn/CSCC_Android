package com.Amber;
import java.util.*;

/**
 * Created by Amber on 4/14/2016.
 */

interface WeatherDataListener
{
    public void updateData (WeatherData data);
}

interface WeatherDataSource //add, remove, and update the listener
{
    public void addListener(WeatherDataListener listener);
    public void removeListener (WeatherDataListener listener);
    public void update();
}

abstract class WeatherData //represent data associated with thing getting passed to collect data
{
    public String getDataType() {
        return dataType;
    }

    public double getMeasureValue() {
        return measureValue;
    }

    private String dataType;
    private double measureValue;

    WeatherData (String dataType, double measureValue)
    {
        this.dataType = dataType;
        this.measureValue = measureValue;
    }

    abstract public String getUpdateMessage (); //abstract method message to provide implementation for weather

}

class TemperatureSensor implements WeatherDataSource //have to include methods of WeatherDataSource
{
    private List<WeatherDataListener> listeners = new ArrayList<>();
    private double currentTemp;

    //comstructor
    TemperatureSensor ()
    {
        updateTemp();
    }

    //method for getting current temp
    public double getCurrentTemp ()
    {
        return currentTemp;
    }

    //method for update the temperatur
    private void updateTemp ()
    {//read from temperature sensor
        currentTemp = new Random().nextDouble() * 100;
    }
    //implemention
    @Override
    public void addListener(WeatherDataListener listener)
    {//interact with user, add listener
        listeners.add(listener);
    }

    @Override
    public void removeListener(WeatherDataListener listener)
    {
        listeners.remove(listener);
    }

    @Override
    public void update()
    {
        System.out.println("Temperature sensor getting your data");
        updateTemp();

        for(WeatherDataListener listener: listeners)
        {
            listener.updateData(new WeatherData("temperature", currentTemp) {
                @Override
                public String getUpdateMessage() {
                    return "Tempertaure updated to " + currentTemp;
                }
            });
        }

    }
}

class HumidtySensor implements WeatherDataSource //have to include methods of WeatherDataSource
{
    private List<WeatherDataListener> listeners = new ArrayList<>();

    public double getCurrentHumid() {
        return currentHumid;
    }

    private double currentHumid;

    //comstructor
    HumidtySensor ()
    {
        updateHumidty();
    }

    //method for getting current temp
    public double updateHumidty ()
    {
        return currentHumid;
    }

    //method for update the temperatur
    private void updateTemp ()
    {//read from temperature sensor
        currentHumid = new Random().nextDouble() * 100;
    }
    //implemention
    @Override
    public void addListener(WeatherDataListener listener)
    {//interact with user, add listener
        listeners.add(listener);
    }

    @Override
    public void removeListener(WeatherDataListener listener)
    {
        listeners.remove(listener);
    }

    @Override
    public void update()
    {
        System.out.println("Humidity sensor getting your data");
        updateHumidty();

        for(WeatherDataListener listener: listeners)
        {
            listener.updateData(new WeatherData("Humidity", currentHumid) {
                @Override
                public String getUpdateMessage() {
                    return "Humidity updated to " + currentHumid;
                }
            });
        }

    }
}

class PressureSensor implements WeatherDataSource //have to include methods of WeatherDataSource
{
    private List<WeatherDataListener> listeners = new ArrayList<>();

    public double getCurrentPressure() {
        return currentPressure;
    }

    private double currentPressure;

    //comstructor
    PressureSensor ()
    {
        updatePressure();
    }

    //method for getting current temp
    public double updatePressure ()
    {
        return currentPressure;
    }

    //method for update the temperatur
    private void updateTemp ()
    {//read from temperature sensor
        currentPressure = new Random().nextDouble() * 100;
    }
    //implemention
    @Override
    public void addListener(WeatherDataListener listener)
    {//interact with user, add listener
        listeners.add(listener);
    }

    @Override
    public void removeListener(WeatherDataListener listener)
    {
        listeners.remove(listener);
    }

    @Override
    public void update()
    {
        System.out.println("Pressure sensor getting your data");
        updatePressure();

        for(WeatherDataListener listener: listeners)
        {
            listener.updateData(new WeatherData("Pressure", currentPressure) {
                @Override
                public String getUpdateMessage() {
                    return "Pressure updated to " + currentPressure;
                }
            });
        }

    }
}

class WeatherStation implements WeatherDataListener
{
    private Map<String, Double> allWeatherData = new HashMap<>();
    private List<String> log =  new ArrayList<>();

    @Override
    public void updateData(WeatherData data)
    {
        System.out.println("Weather Station updating data with new " + data.getDataType() + " data");
        allWeatherData.put(data.getDataType(), data.getMeasureValue());
        log.add(data.getUpdateMessage());
    }

    //display methods
    public void displayCurrentWeather()
    {
        System.out.println("Weather Report");
        for(String dataType : allWeatherData.keySet())
        {
            System.out.println(dataType + " : " + allWeatherData.get(dataType));
        }
    }

    public void displayLog()
    {
        for(int i =0; i < log.size(); i++)
        {
            int currentLine = i + 1;
            System.out.println(currentLine + " : " + log.get(i));

        }
    }
}


public class Main {
    public static void main (String[] args)
    {
        System.out.println("Main is creating objects");
        WeatherStation localWeatherStation = new WeatherStation();
        TemperatureSensor temp = new TemperatureSensor();
        HumidtySensor humid = new HumidtySensor();
        PressureSensor pressure = new PressureSensor();

        temp.addListener(localWeatherStation);
        humid.addListener(localWeatherStation);
        pressure.addListener(localWeatherStation);

        System.out.println("Simulating updates from sesnors");
        temp.update();
        humid.update();
        pressure.update();
        temp.update();

        System.out.println("display report and log");
        localWeatherStation.displayCurrentWeather();
        localWeatherStation.displayLog();
    }
}
