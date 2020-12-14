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


    public String getName() {
        return name;
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + this.name);
        System.out.println(prefix + "Lieblingstier: " + favoriteAnimal.getName());
        System.out.println(prefix + "Gehege: ");
        for (var cage :
                myCages) {
            System.out.println(prefix + "  " + cage.getName());
        }



    }
}


