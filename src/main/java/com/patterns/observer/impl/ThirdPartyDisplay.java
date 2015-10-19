package com.patterns.observer.impl;

import com.patterns.observer.DisplayElement;
import com.patterns.observer.Observer;

/**
 * Created by PXV8340 on 10/16/2015.
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
