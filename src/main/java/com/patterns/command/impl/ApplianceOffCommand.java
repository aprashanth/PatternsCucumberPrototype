package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.ApplicanceControl;

/**
 * Created by vadulasp on 10/23/15.
 */
public class ApplianceOffCommand implements Command {
    ApplicanceControl applicanceControl;

    public ApplianceOffCommand(ApplicanceControl applicanceControl){
        this.applicanceControl = applicanceControl;
    }

    @Override
    public void execute() {
        applicanceControl.off();
    }

    @Override
    public void undo() {
        applicanceControl.on();
    }
}
