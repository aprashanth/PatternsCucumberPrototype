package com.patterns.command.impl;

import com.patterns.command.Command;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public class SimpleRemoteControl {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed(){
        if (null != command) this.command.execute();
    }
}
