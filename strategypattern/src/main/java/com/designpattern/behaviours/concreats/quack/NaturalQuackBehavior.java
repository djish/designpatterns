package com.designpattern.behaviours.concreats.quack;

import com.designpattern.behaviours.IQuackBehavior;

public class NaturalQuackBehavior implements IQuackBehavior {
    @Override
    public String quack() {
        return "Naturally Quack";
    }
}
