package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

/**
 * Created by vadulasp on 10/20/15.
 */
public abstract class AbstractPizzaStore {

    public Pizza orderPizza(String pizzaType){

        Pizza pizza  = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza.getDescription() + " is ready for pickup...");

        return pizza;

    }

    //Abstract factory method
    public abstract Pizza createPizza(String pizzaType);
}


