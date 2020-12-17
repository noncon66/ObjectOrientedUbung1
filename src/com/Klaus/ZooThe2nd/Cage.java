package com.Klaus.ZooThe2nd;

import java.util.Vector;

public class Cage {
    private String name;
    private Vector<Animal> animals;

    public Cage(String name) {
        this.name = name;
        this.animals = new Vector<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void printStructure(String prefix){
        System.out.println(prefix + "Gehege: " + name);
        System.out.println("  " + prefix + "Tiere:");
        for (Animal a :
                animals) {
            a.printStructure("  " + "  " + prefix);
            System.out.println();
        }


    }


}
