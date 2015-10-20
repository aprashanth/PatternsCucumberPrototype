package com.patterns.observer.impl;

/**
 * Created by PXV8340 on 10/16/2015.
 */
public class TestWeatherStation {

    public static void main(String args[]) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        System.out.println("First change in measurements....");
        weatherData.setMeasurements(12, 20, 25);

        System.out.println("Second change in measurements....");
        weatherData.setMeasurements(1, 2, 3);

        JWeatherData jWeatherData = new JWeatherData();
        JCurrentConditionsDisplay jCurrentConditionsDisplay = new JCurrentConditionsDisplay(jWeatherData);
        jWeatherData.setMeasurements(123, 234, 34);
    }
}
