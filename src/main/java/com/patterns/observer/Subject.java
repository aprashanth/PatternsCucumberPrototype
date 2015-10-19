package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PXV8340 on 10/16/2015.
 */
public interface Subject {

    List<Observer> observers = new ArrayList<Observer>();

    default void registerObserver(Observer observer) {
        observers.add(observer);
    }

   public void notifyObserver(Observer observer);

    default void notifyObservers() {
        observers.forEach(observer -> notifyObserver(observer));
    }

    default void removeObserver(Observer observer){
        observers.remove(observer);
    }
}
