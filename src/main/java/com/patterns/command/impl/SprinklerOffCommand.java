package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.Sprinkler;

/**
 * Created by vadulasp on 10/23/15.
 */
public class SprinklerOffCommand implements Command {

    Sprinkler sprinkler;

    public SprinklerOffCommand(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.off();
    }

    @Override
    public void undo() {
        sprinkler.on();
    }
}
