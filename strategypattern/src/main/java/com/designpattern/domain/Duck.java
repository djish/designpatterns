package com.designpattern.domain;

import com.designpattern.behaviours.IDisplayBehavior;
import com.designpattern.behaviours.IFlyBehavior;
import com.designpattern.behaviours.IQuackBehavior;

public class Duck implements IQuackBehavior, IDisplayBehavior, IFlyBehavior {

    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;
    IFlyBehavior flyBehavior;

    public Duck(IQuackBehavior quackBehavior,
                IDisplayBehavior displayBehavior,
                IFlyBehavior flyBehavior) {

        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
        this.flyBehavior = flyBehavior;

    }

    @Override
    public String display() {
        return this.displayBehavior.display();
    }

    @Override
    public String fly() {
        return this.flyBehavior.fly();
    }

    @Override
    public String quack() {
        return this.quackBehavior.quack();
    }

}
