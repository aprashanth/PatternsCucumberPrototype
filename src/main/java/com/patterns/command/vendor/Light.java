package com.patterns.command.vendor;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class Light {

    private String name;

    public Light(String name){
        this.name = name;
    }


    public void on(){
        System.out.println(name + " Light is on..");
    }


    public void off(){
        System.out.println(name + " Light is off..");
    }
}
