package com.Klaus.Kindergarten;

import java.util.Random;

public class Cat extends Animal implements ISimulation {
    Random random = new Random();


    public Cat(String name) {
        super(name);
    }

    @Override
    public void doSimulation() {

    }

    public void goToChild() {
        myKindi.getChildren().elementAt(random.nextInt(myKindi.getChildren().size()));
    }


}
