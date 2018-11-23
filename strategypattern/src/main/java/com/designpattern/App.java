package com.designpattern;

import com.designpattern.behaviours.concreats.display.ImageDisplayBehavior;
import com.designpattern.behaviours.concreats.display.LiveDisplayBehavior;
import com.designpattern.behaviours.concreats.fly.FlyHighBehavior;
import com.designpattern.behaviours.concreats.fly.FlyLowBehavior;
import com.designpattern.behaviours.concreats.fly.NoFlyBehavior;
import com.designpattern.behaviours.concreats.quack.NaturalQuackBehavior;
import com.designpattern.behaviours.concreats.quack.RoboticQuackBehavior;
import com.designpattern.domain.Duck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * Strategy pattern is used when we have multiple algorithm for a specific task
         * and client decides the actual implementation to be used at runtime.
         *
         * For example, we say we have four types of ducks
         * 1. Wild Duck
         * 2. Mountain Duck
         * 3. Rubber Duck
         * 4. Robotic Duck
         *
         */

        Duck wildDuck = new Duck(new NaturalQuackBehavior(), new LiveDisplayBehavior(), new FlyHighBehavior());

        System.out.println("Wild Duck will " + wildDuck.display());
        System.out.println("Wild Duck will " + wildDuck.fly());
        System.out.println("Wild Duck will " + wildDuck.quack());

        Duck mountainDuck = new Duck(new NaturalQuackBehavior(), new LiveDisplayBehavior(), new FlyLowBehavior());

        System.out.println("Mountain Duck will " + mountainDuck.display());
        System.out.println("Mountain Duck will " + mountainDuck.fly());
        System.out.println("Mountain Duck will " + mountainDuck.quack());

        Duck rubberDuck = new Duck(new RoboticQuackBehavior(), new ImageDisplayBehavior(), new NoFlyBehavior());

        System.out.println("Rubber Duck will " + rubberDuck.display());
        System.out.println("Rubber Duck will " + rubberDuck.fly());
        System.out.println("Rubber Duck will " + rubberDuck.quack());

        Duck roboticDuck = new Duck(new RoboticQuackBehavior(), new ImageDisplayBehavior(), new FlyLowBehavior());

        System.out.println("Robotic Duck will " + roboticDuck.display());
        System.out.println("Robotic Duck will " + roboticDuck.fly());
        System.out.println("Robotic Duck will " + roboticDuck.quack());


    }
}
