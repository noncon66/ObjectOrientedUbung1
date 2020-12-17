package com.Klaus.ZooThe2nd;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Vector<Cage> myCages;
    private Animal favoriteAnimal;

    public Zookeeper(String name, Animal favoriteAnimal) {
        this.name = name;
        this.favoriteAnimal = favoriteAnimal;
        this.myCages = new Vector<>();
    }

    public void addCage(Cage cage){
        myCages.add(cage);
    }

    public void printStructure(String prefix){
        System.out.println(prefix + name + " (Lieblingstier: " +  favoriteAnimal.getName() + ")");

    }

    public void startToWork() {
        System.out.println(name + " beginnt zu arbeiten");
        this.feedAndWatchCage("");
        
        
    }
    private void feedAndWatchCage(String prefix) {
        for (Cage c :
                myCages) {
            c.feedAnimals("  " + prefix);
            c.watchAnimals("  " + prefix, favoriteAnimal.getName());
        }
    }


}
