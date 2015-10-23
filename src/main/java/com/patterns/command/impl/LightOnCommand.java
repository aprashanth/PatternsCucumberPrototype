package com.patterns.command.impl;

import com.patterns.command.Command;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
