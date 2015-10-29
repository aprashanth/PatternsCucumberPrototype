package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.GarageDoor;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
        garageDoor.up();
    }
}
