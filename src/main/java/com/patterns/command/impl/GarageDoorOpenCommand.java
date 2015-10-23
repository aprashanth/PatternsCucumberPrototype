package com.patterns.command.impl;

import com.patterns.command.Command;

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
        garageDoor.up();
    }
}
