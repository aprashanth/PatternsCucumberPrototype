package com.patterns.observer.impl;

import com.patterns.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by PXV8340 on 10/19/2015.
 */
public class JCurrentConditionsDisplay implements Observer, DisplayElement{

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;


    public JCurrentConditionsDisplay(Observable jWeatherData){
        this.observable = jWeatherData;
        jWeatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JWeatherData) {
            JWeatherData weatherData = (JWeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("JJJJJ -Conditions display: " + "temp: " + temperature + " pressure: " + pressure + " humidity " + humidity);
    }
}
