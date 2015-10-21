package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

import java.util.function.Supplier;

/**
 * Created by vadulasp on 10/20/15.
 */
public class ChicagoPizzaStore extends AbstractPizzaStore {
    public static ChicagoPizzaStore create(Supplier<ChicagoPizzaStore> supplier) {
        return supplier.get();
    }

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("Cheese")) {
            pizza = ChicagoCheezePizza.create(ChicagoCheezePizza::new);
        }else if (pizzaType.equals("Clam")) {
            pizza = ChicagoClamPizza.create(ChicagoClamPizza::new);
        }if (pizzaType.equals("Veggie")) {
            pizza = ChicagoVeggiePizza.create(ChicagoVeggiePizza::new);
        }if (pizzaType.equals("Pepperoni")) {
            pizza = ChicagoPepperoniPizza.create(ChicagoPepperoniPizza::new);
        }

        return pizza;
    }
}
