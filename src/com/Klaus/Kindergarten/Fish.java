package com.Klaus.Kindergarten;

import java.util.Vector;

public class Fish extends Animal implements ISimulation{

    public Fish(String name) {
        super(name);
    }

        @Override
    public void doSimulation(Vector<Child> children) {
            System.out.println("Fish " + this.name + " does nothing");
    }

}
