package com.Klaus.Kindergarten;

import java.util.Random;
import java.util.Vector;

public class Cat extends Animal implements ISimulation {
    Random random = new Random();


    public Cat(String name) {
        super(name);
    }

    @Override
    public void doSimulation(Vector<Child> children) {
        var c = children.elementAt(random.nextInt(children.size()));
        c.setMood(c.getMood()+1);
        System.out.println("Cat " +name + " goes to " +c.getName() + " (+1)");
    }
}
