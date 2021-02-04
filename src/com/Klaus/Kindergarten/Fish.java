package com.Klaus.Kindergarten;

public class Fish extends Animal implements ISimulation{

    public Fish(String name) {
        super(name);
    }

        @Override
    public void doSimulation() {
        doNothing();
    }

    public void doNothing(){
        System.out.println("Fish " + this.name + " does nothing");
    }
}
