package com.designpattern.behaviours.concreats.display;

import com.designpattern.behaviours.IDisplayBehavior;

public class LiveDisplayBehavior implements IDisplayBehavior {

    @Override
    public String display() {
        return "Live Display";
    }
}
