package com.jishnu.java;

import com.jishnu.java.observer.concrete.LCDDisplay;
import com.jishnu.java.observer.concrete.PhoneDisplay;
import com.jishnu.java.observer.concrete.WeatherStation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        LCDDisplay lcdDisplay = new LCDDisplay(station);

        station.add(phoneDisplay);
        station.add(lcdDisplay);

        for(int index = 30; index < 100; index++) {
            System.out.println("-----------------------------------");
            System.out.println("Setting temperature " + station.getTemperature() + index);
            station.setTemperature(station.getTemperature() + index);
        }
    }
}
