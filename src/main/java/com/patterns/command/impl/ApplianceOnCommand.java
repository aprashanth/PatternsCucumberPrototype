package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.ApplicanceControl;

/**
 * Created by vadulasp on 10/23/15.
 */
public class ApplianceOnCommand implements Command {
    ApplicanceControl applicanceControl;

    public ApplianceOnCommand(ApplicanceControl applicanceControl){
        this.applicanceControl = applicanceControl;
    }

    @Override
    public void execute() {
        applicanceControl.on();
    }

    @Override
    public void undo() {
        applicanceControl.off();
    }
}
