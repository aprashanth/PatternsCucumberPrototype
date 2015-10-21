package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

import java.util.function.Supplier;

/**
 * Created by vadulasp on 10/20/15.
 */
public class NYPizzaStore extends AbstractPizzaStore {
    public static NYPizzaStore create(Supplier<NYPizzaStore> supplier) {
        return supplier.get();
    }

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("Cheese")) {
            pizza = NYCheezePizza.create(NYCheezePizza::new);
        }else if (pizzaType.equals("Clam")) {
            pizza = NYClamPizza.create(NYClamPizza::new);
        }if (pizzaType.equals("Veggie")) {
            pizza = NYVeggiePizza.create(NYVeggiePizza::new);
        }if (pizzaType.equals("Pepperoni")) {
            pizza = NYPepperoniPizza.create(NYPepperoniPizza::new);
        }

        return pizza;
    }
}
