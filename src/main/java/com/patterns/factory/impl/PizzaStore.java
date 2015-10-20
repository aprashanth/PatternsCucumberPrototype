package com.patterns.factory.impl;

import com.patterns.factory.Pizza;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class PizzaStore {


    public static PizzaStore create(Supplier<PizzaStore> supplier) {
        return supplier.get();
    }

    public Pizza orderPizza(String pizzaType){

        Pizza pizza = SimplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza.getDescription() + " is ready for pickup...");

        return pizza;

    }
}
