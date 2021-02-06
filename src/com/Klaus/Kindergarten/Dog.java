package com.Klaus.Kindergarten;

import java.util.Random;
import java.util.Vector;

public class Dog extends Animal implements ISimulation{
    Random random = new Random();

    public Dog(String name) {
        super(name);
    }

    @Override
    public void doSimulation(Vector<Child> children) {
        var c = children.elementAt(random.nextInt(children.size()));
        c.setMood(c.getMood()+1);
        System.out.println("Dog " +name + " goes to " +c.getName() + " and scares it (-1)");

    }

}
