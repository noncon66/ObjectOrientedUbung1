package com.Klaus.Zoo;

import java.util.Vector;

public class Cage {
    private String name;
    private Vector<Animal> animalsInCage;

    public Cage(String name) {
        this.name = name;
        this.animalsInCage = new Vector<>();
    }

    public Cage(String name, Zoo zoo) {
        this.name = name;
        this.animalsInCage = new Vector<>();
        zoo.addCage(this);
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal newAnimal){
        animalsInCage.add(newAnimal);
    }

    public void addToZoo(Zoo zoo){
        zoo.addCage(this);
    }


    public void printStructure(String prefix){
        System.out.println(this.name);
        System.out.print(prefix + "Tiere: ");
        for (int i = 0; i < animalsInCage.size(); i++) {
            animalsInCage.get(i).printStructure();
            if (i != animalsInCage.size()-1) {
                System.out.print(", ");
            }
        }

    }


}
