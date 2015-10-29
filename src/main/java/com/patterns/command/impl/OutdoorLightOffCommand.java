package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.Light;
import com.patterns.command.vendor.OutdoorLight;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class OutdoorLightOffCommand implements Command {

    OutdoorLight light;

    public OutdoorLightOffCommand(OutdoorLight light){
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
