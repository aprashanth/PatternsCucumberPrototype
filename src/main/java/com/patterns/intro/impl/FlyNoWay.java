package com.patterns.intro.impl;

import com.patterns.intro.FlyBehavior;

/**
 * Created by PXV8340 on 10/8/2015.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        //Does not fly
        System.out.println("I cannot fly...");
    }
}
