package com.designpattern.behaviours.concreats.quack;

import com.designpattern.behaviours.IQuackBehavior;

public class RoboticQuackBehavior implements IQuackBehavior {

    @Override
    public String quack() {
        return "Quack Robotically";
    }
}
