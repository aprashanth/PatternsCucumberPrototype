package com.patterns.intro.impl;

import com.patterns.intro.FlyBehavior;
import com.patterns.intro.QuackBehavior;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }

}
