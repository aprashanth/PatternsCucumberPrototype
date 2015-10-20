package com.patterns.decorator;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }

}
