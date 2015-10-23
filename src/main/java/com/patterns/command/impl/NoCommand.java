package com.patterns.command.impl;

import com.patterns.command.Command;

/**
 * Created by PXV8340 on 10/23/2015.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("This button on the remote has not been programmed...");
    }
}
