package com.patterns.intro.impl;

import com.patterns.intro.QuackBehavior;

/**
 * Created by PXV8340 on 10/15/2015.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Mute Mute....");
    }
}
