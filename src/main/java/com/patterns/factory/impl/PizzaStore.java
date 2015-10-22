package com.patterns.factory.impl;

import com.patterns.factory.Pizza;
import com.patterns.factory.method.PizzaFactory;

import java.util.function.Supplier;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class PizzaStore {


    private PizzaFactory pizzaFactory;

    public static PizzaStore create(Supplier<PizzaStore> supplier) {
        return supplier.get();
    }

    public Pizza orderPizza(String pizzaType){

        //Pizza pizza = SimplePizzaFactory.createPizza(pizzaType);
        Pizza pizza  = pizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza.getDescription() + " is ready for pickup...");

        return pizza;

    }

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }
}
