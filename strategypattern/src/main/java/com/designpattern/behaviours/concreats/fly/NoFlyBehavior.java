package com.designpattern.behaviours.concreats.fly;

import com.designpattern.behaviours.IFlyBehavior;

public class NoFlyBehavior implements IFlyBehavior {
    
    @Override
    public String fly() {
        return "Not fly";
    }
}
