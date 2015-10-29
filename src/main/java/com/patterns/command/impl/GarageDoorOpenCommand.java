package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.GarageDoor;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
