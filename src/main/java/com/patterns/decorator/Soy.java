package com.patterns.decorator;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = 0;
        if (beverage.getSize() == Size.TALL) {
                cost = beverage.cost() + .10;
        }   else if (beverage.getSize() == Size.GRANDE) {
                cost = beverage.cost() + .15;
        }   else if(beverage.getSize() == Size.VENTI){
                cost = beverage.cost() + .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "-Soy";
    }
}
