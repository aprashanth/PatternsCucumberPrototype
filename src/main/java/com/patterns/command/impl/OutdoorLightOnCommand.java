package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.OutdoorLight;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class OutdoorLightOnCommand implements Command {

    OutdoorLight light;

    public OutdoorLightOnCommand(OutdoorLight light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
