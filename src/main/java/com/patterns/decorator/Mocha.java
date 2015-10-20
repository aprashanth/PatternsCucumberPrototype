package com.patterns.decorator;

import com.patterns.intro.impl.MallardDuck;
import com.patterns.intro.impl.ModelDuck;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "-Mocha";
    }
}
