package com.Klaus.Zoo;

public class Animal {
    private String name;
    private String species;
    private Cage isInCage;

    public Animal(String name, String species, Cage isInCage) {
        this.name = name;
        this.species = species;
        this.isInCage = isInCage;
    }

    public void addToCage(Cage cage) {
        isInCage = cage;
        cage.addAnimal(this);
    }

    public void printStructure(){


    }


}
