package com.jishnu.java.observer.concrete;

import com.jishnu.java.observer.IObserver;

public class LCDDisplay implements IObserver, IDisplay {

    WeatherStation station;

    public LCDDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.display(this.station.getTemperature());
    }

    @Override
    public void display(float data) {
        System.out.println("The updated temperature in LCD display is : " + data);
    }
}
