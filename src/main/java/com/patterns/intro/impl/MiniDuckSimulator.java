package com.patterns.intro.impl;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class MiniDuckSimulator {

    public static void main(String args[]){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.perfrmFly();
        mallardDuck.perfromQuack();

        Duck modelDuck = ModelDuck.create(ModelDuck::new);
        modelDuck.setFlyBehavior(new FlyWithRocketPower());
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.display();
        modelDuck.perfrmFly();
        modelDuck.perfromQuack();

    }
}
