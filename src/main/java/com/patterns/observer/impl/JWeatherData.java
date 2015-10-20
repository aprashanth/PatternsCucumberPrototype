package com.patterns.observer.impl;

import java.util.Observable;

/**
 * Created by PXV8340 on 10/19/2015.
 */
public class JWeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temperature);
        measurementsChanged();
    }

}
