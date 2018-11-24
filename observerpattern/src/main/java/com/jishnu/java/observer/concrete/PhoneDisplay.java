package com.jishnu.java.observer.concrete;

import com.jishnu.java.observer.IObserver;

public class PhoneDisplay implements IObserver, IDisplay {

    WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.display(this.station.getTemperature());
    }


    @Override
    public void display(float data) {
        System.out.println("The updated temperature in Phone display is : " + data);
    }
}
