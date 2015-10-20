package com.patterns.decorator;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
