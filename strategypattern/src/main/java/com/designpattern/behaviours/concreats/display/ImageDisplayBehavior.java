package com.designpattern.behaviours.concreats.display;

import com.designpattern.behaviours.IDisplayBehavior;

public class ImageDisplayBehavior implements IDisplayBehavior {
    @Override
    public String display() {
        return "Image Display";
    }
}
