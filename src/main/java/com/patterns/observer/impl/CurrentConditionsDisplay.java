package com.patterns.observer.impl;

import com.patterns.observer.DisplayElement;
import com.patterns.observer.Observer;
import com.patterns.observer.Subject;


/**
 * Created by PXV8340 on 10/16/2015.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final Subject subject;
    private float temperature;
    private float pressure;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData){
        this.subject = weatherData;
        subject.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Conditions display: " + "temp: " + temperature + " pressure: " + pressure + " humidity " + humidity);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
