package com.patterns.observer.impl;

import com.patterns.observer.DisplayElement;
import com.patterns.observer.Observer;
import com.patterns.observer.Subject;

import java.util.function.ObjDoubleConsumer;

/**
 * Created by PXV8340 on 10/16/2015.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private final Subject subject;
    private float temperature;
    private float pressure;
    private float humidity;

    public ForecastDisplay(Subject weatherData){
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast display: " + "temp: " + temperature + " pressure: " + pressure + " humidity " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
