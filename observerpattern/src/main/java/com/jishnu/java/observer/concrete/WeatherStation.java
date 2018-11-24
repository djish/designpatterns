package com.jishnu.java.observer.concrete;

import com.jishnu.java.observer.IObservable;
import com.jishnu.java.observer.IObserver;

import java.util.ArrayList;

public class WeatherStation implements IObservable {

    private ArrayList<IObserver> observers = new ArrayList<>();

    private float temperature = 0;

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyChange() {
        for (IObserver observer : this.observers){
            observer.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {

        if(this.temperature != temperature) {
            this.temperature = temperature;
            notifyChange();
        }

    }

}
