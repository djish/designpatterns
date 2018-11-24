package com.jishnu.java.observer;

public interface IObservable {

    public void add(IObserver observer);

    public void remove(IObserver observer);

    public void notifyChange();
}
