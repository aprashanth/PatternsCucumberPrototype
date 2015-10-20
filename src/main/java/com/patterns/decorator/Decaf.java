package com.patterns.decorator;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class Decaf extends Beverage {


    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
