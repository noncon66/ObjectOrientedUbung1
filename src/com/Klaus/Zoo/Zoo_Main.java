package com.Klaus.Zoo;

public class Zoo_Main {
    public static void main(String[] args) {
        Zoo rapperswil = new Zoo("Rapperswil");

        Cage monkeys = new Cage("Affenhaus");
        Cage bigCats = new Cage("Raubkatzen");
        Cage reptiles = new Cage ("Reptilienhaus", rapperswil);

        Animal lionMale = new Animal("Löwe", "Großkatze", bigCats);
        Animal lionFemale = new Animal("Löwin", "Großkatze");
        Animal leopard = new Animal("Leopard", "Großkatze");

        Animal chimpanzee = new Animal("Schimpanse", "Schimpansen");
        Animal orangutan = new Animal("Orang-Utan", "Orang-Utans");

        Animal greenMamba = new Animal("Grüne Mamba", "Schlange", reptiles);
        Animal gecko = new Animal("Gecko", "Schuppenkriechtier");

        bigCats.addAnimal(lionFemale);
        leopard.addToCage(bigCats);

        monkeys.addAnimal(chimpanzee);
        monkeys.addAnimal(orangutan);

        reptiles.addAnimal(gecko);

        rapperswil.addCage(monkeys);
        bigCats.addToZoo(rapperswil);

        rapperswil.printStructure("  ");

    }
}
