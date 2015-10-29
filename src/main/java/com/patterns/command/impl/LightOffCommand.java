package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.Light;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
