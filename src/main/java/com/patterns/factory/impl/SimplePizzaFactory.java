package com.patterns.factory.impl;

import com.patterns.factory.Pizza;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equals("Cheeze")) {
            pizza = CheezePizza.create(CheezePizza::new);
        }else if (pizzaType.equals("Clam")) {
            pizza = ClamPizza.create(ClamPizza::new);
        }if (pizzaType.equals("Veggie")) {
            pizza = VeggiePizza.create(VeggiePizza::new);
        }if (pizzaType.equals("Pepperoni")) {
            pizza = PepperoniPizza.create(PepperoniPizza::new);
        }

        return pizza;
    }
}
