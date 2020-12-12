package com.Klaus.Zoo;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Animal favoriteAnimal;
    private Vector<Cage> myCages;

    public Zookeeper(String name, Animal favoriteAnimal) {
        this.name = name;
        this.favoriteAnimal = favoriteAnimal;
        myCages = new Vector<>();
    }

    public void addCage(Cage cage) {
        myCages.add(cage);
    }


    public String getName() {
        return name;
    }
}


