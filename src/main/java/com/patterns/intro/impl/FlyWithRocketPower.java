package com.patterns.intro.impl;

import com.patterns.intro.FlyBehavior;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class FlyWithRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I use Rocket Power to fly...");
    }

}
