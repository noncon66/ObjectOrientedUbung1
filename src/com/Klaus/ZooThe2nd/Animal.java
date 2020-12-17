package com.Klaus.ZooThe2nd;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void printStructure(String prefix){
        System.out.printf("%s %s (%s)", prefix, name, species);
    }

    public String getName() {
        return name;
    }
}
