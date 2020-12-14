package com.Klaus.Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Cage> cagesInZoo;
    private Vector<Food> foods;
    private Vector<Zookeeper> zookeepers;
    private Vector<Veterinary> veterinaries;


    public Zoo(String name) {
        this.name = name;
        cagesInZoo = new Vector<>();
        foods = new Vector<>();
        zookeepers = new Vector<>();
        veterinaries = new Vector<>();
    }

    public Cage searchAndCreateCage(String name) {
        for (int i = 0; i < cagesInZoo.size(); i++) {
            if (cagesInZoo.get(i).getName().equals(name)) {
                return cagesInZoo.get(i);
            }
        }
        Cage c = new Cage(name);
        cagesInZoo.add(c);
        return c;
    }

    public Food searchAndCreateFood(String name) {
        for (var food : foods) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        Food f = new Food(name, "tbd");
        foods.add(f);
        return f;
    }

    public Food searchAndCreateFood(String name, String unit) {
        Food f = searchAndCreateFood(name);
        f.setUnit(unit);
        return f;
    }


    public Animal createAnimal(String cagename, String animalname, String species, String favoriteFood, int foodDemand) {
        return new Animal(this, cagename, animalname, species, favoriteFood, foodDemand);
    }

    public Zookeeper searchAndCreateZookeeper(String name, Animal favoriteAnimal, String[] cageNames) {

        //search for zookeeper
        for (var zookeeper : zookeepers) {
            if (zookeeper.getName().equals(name)) {
                return zookeeper;
            }
        }
        //search for Cages
        Vector<Cage> myCages = new Vector<>();
        for (var cageName : cageNames) {
            var cage = searchAndCreateCage(cageName);
            myCages.add(cage);
        }

        //createZookeeper
        var zookeeper = new Zookeeper(name, favoriteAnimal, myCages);
        zookeepers.add(zookeeper);
        return zookeeper;

    }


    public Veterinary searchAndCreateVeterinary(String name) {
        for (var vet :
                veterinaries) {
            if (vet.getName().equals(name)) {
                return vet;
            }
        }

        var vet = new Veterinary(name);
        veterinaries.add(vet);
        return vet;
    }



    public void addCage(Cage cage) {
        cagesInZoo.add(cage);
    }

    public void printStructure(String prefix) {
        System.out.println("Zoo: " + this.name);
        for (int i = 0; i < cagesInZoo.size(); i++) {
            System.out.print(prefix + "Gehege: ");
            cagesInZoo.get(i).printStructure("  " + prefix);
        }

        for (var keeper : zookeepers) {
            System.out.println(prefix + "Pfleger: ");
            keeper.printStructure("  " + prefix);
        }

        for (var vet : veterinaries) {
            System.out.println(prefix + "Tierärzte: ");
            vet.printStructure("  " + prefix);

        }

    }


}
