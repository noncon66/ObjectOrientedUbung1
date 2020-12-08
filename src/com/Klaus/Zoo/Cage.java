package com.Klaus.Zoo;

import java.util.Vector;

public class Cage {
    private String name;
    private Vector<Animal> animalsInCage;
    private Zoo isInZoo;

    public Cage(String name, Zoo isInZoo) {
        this.name = name;
        this.animalsInCage = new Vector<>();
        this.isInZoo = isInZoo;
    }

    public void addAnimal(Animal newAnimal){
        animalsInCage.add(newAnimal);
        newAnimal.addToCage(this);
    }

    public void addZoo(Zoo zoo){
        isInZoo = zoo;
        zoo.addCage(this);


    }

    public void printStructure(){

    }


}
