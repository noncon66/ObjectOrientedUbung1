package com.Klaus.Zoo;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Animal favoriteAnimal;
    private Vector<Cage> myCages;

    public Zookeeper(String name, Animal favoriteAnimal, Vector<Cage> myCages) {
        this.name = name;
        this.favoriteAnimal = favoriteAnimal;
        this.myCages = myCages;
    }

    public void addCage(Cage cage) {
        myCages.add(cage);
    }


    public String getName() {
        return name;
    }

    public void printStructure() {
     //todo


    }
}


