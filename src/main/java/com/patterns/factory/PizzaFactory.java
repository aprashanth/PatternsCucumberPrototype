package com.patterns.factory;

import com.patterns.factory.impl.CheezePizza;
import com.patterns.factory.impl.ClamPizza;
import com.patterns.factory.impl.PepperoniPizza;
import com.patterns.factory.impl.VeggiePizza;

/**
 * Created by vadulasp on 10/20/15.
 */
public interface PizzaFactory {

    default Pizza createPizza(String pizzaType) {
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
