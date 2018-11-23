package com.designpattern.behaviours.concreats.fly;

import com.designpattern.behaviours.IFlyBehavior;

public class FlyHighBehavior implements IFlyBehavior {
    @Override
    public String fly() {
        return "Fly High";
    }
}
