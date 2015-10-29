package com.patterns.command.impl;

import com.patterns.command.Command;
import com.patterns.command.vendor.Stereo;

/**
 * Created by PXV8340 on 10/23/2015.
 */
public class StereoOffWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(0);
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
