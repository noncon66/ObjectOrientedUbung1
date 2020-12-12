package com.Klaus.Zoo;

public class Animal {
    private String name;
    private String species;
    private int foodDemand;
    private Food favoriteFood;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal(String name, String species, Cage cage) {
        this.name = name;
        this.species = species;
        cage.addAnimal(this);
    }

    public void setFoodDemand(int foodDemand) {
        this.foodDemand = foodDemand;
    }

    public void addToCage(Cage cage){
        cage.addAnimal(this);
    }

    public void printStructure(){
        System.out.print(this.name);
    }


}
