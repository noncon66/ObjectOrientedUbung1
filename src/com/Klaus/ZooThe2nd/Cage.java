package com.Klaus.ZooThe2nd;

import java.util.Random;
import java.util.Vector;

public class Cage {
    private String name;
    private Vector<Animal> animals;

    public Cage(String name) {
        this.name = name;
        this.animals = new Vector<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + "Gehege: " + name);
        System.out.println("  " + prefix + "Tiere:");
        for (Animal animal :
                animals) {
            animal.printStructure("  " + "  " + prefix);
            System.out.println();
        }
    }

    public void feedAnimals(String prefix) {
        System.out.println(prefix + "Gehege: " + name);
        for (Animal animal :
                animals) {
            System.out.println("  " + prefix + animal.getName() + " wird gefüttert");
        }
    }

    public void watchAnimals(String prefix, String favAnimal) {
        Random random = new Random();
        for (Animal animal :
                animals) {
            //Lieblingstier mit einer Warscheinlichleit von 50%
            if (animal.getName() == favAnimal && random.nextDouble() <= 0.5) {
                System.out.println("  " + prefix + "<" + animal.getName() + " beobachten (Liebling)>");

            //alle anderen mit einer Warscheinlichleit von 10%
            } else if (animal.getName() != favAnimal && random.nextDouble() <= 0.1) {
                System.out.println("  " + prefix + "<" + animal.getName() + " beobachten>");
            }

        }


    }
}
