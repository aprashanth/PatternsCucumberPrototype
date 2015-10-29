package com.patterns.command;

/**
 * Created by PXV8340 on 10/22/2015.
 */
public interface Command {

    public void execute();
    public void undo();
}
