package com.Klaus.Zoo;

import java.util.Vector;

public class Cage {
    private String name;
    private Vector<Animal> animalsInCage;
    private Demand[] cageDemand;

    public Cage(String name) {
        this.name = name;
        this.animalsInCage = new Vector<>();
        this.cageDemand = new Demand[animalsInCage.size()];
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal newAnimal){
        animalsInCage.add(newAnimal);
    }

    public void printStructure(String prefix){
        System.out.println(this.name);
        System.out.println(prefix + "Tiere: ");
        for (int i = 0; i < animalsInCage.size(); i++) {
            animalsInCage.get(i).printStructure(prefix);
        }

    }

    public Demand[] getDemands() {
        for (int i = 0; i < cageDemand.length; i++) {
            cageDemand[i] = new Demand(
            animalsInCage.get(i).getFavoriteFoodName(),
            animalsInCage.get(i).getFoodDemand());
        }
        return cageDemand;
    }
}
