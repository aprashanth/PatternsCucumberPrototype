package com.patterns.adapter.impl;

import com.patterns.adapter.DuckDummy;
import com.patterns.adapter.Turkey;
import com.patterns.intro.impl.Duck;

/**
 * Created by PXV8340 on 10/26/2015.
 */
public class TurkeyAdapter implements DuckDummy {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }
}
