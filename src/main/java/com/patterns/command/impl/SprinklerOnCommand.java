package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.ApplicanceControl;
import com.patterns.command.vendor.Sprinkler;

/**
 * Created by vadulasp on 10/23/15.
 */
public class SprinklerOnCommand implements Command {

    Sprinkler sprinkler;

    public SprinklerOnCommand(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.on();
    }

    @Override
    public void undo() {

        sprinkler.off();
    }
}
