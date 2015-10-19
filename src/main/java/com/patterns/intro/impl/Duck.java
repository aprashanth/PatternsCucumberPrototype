package com.patterns.intro.impl;

import com.patterns.intro.FlyBehavior;
import com.patterns.intro.QuackBehavior;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public abstract class Duck {

    public QuackBehavior quackBehavior;

    public FlyBehavior flyBehavior;
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void perfromQuack(){
        this.quackBehavior.quack();
    }

    public void perfrmFly(){
        this.flyBehavior.fly();
    }

    public abstract void display();
}
