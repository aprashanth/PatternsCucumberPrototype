package com.patterns.command.impl;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class GarageDoor {

    public void lightOn(){
        System.out.println("Garage light is on..");
    }

    public void lightOff(){
        System.out.println("Garage light is off..");
    }

    public void up(){
        System.out.println("Garage door is opening..");
    }

    public void down(){
        System.out.println("Garage door is closing..");
    }

    public void stop(){
        System.out.println("Garage door has stopped the current operation..");
    }
}
