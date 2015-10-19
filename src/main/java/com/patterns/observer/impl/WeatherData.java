package com.patterns.observer.impl;

import com.patterns.observer.Observer;
import com.patterns.observer.Subject;

/**
 * Created by PXV8340 on 10/16/2015.
 */
public class WeatherData implements Subject{

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
        notifyObservers();
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.update(getTemperature(), getHumidity(), getPressure());
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temperature);
        measurementsChanged();
    }
}
