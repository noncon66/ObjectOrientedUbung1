package com.Klaus.ZooThe2nd;

public class Main {

    public static void main(String[] args) {

        Zoo2 zoo = new Zoo2("Der Zoo");

        Cage bigCats = new Cage("Raubkatzen");
        Cage monkeys = new Cage("Affenhaus");
        Cage reptiles = new Cage("Reptilienhaus");

        zoo.addCage(bigCats);
        zoo.addCage(monkeys);
        zoo.addCage(reptiles);

        Animal lionMale1 = new Animal("Leo", "Löwe");
        Animal lionFemale1 = new Animal("Leoni", "Löwe");
        Animal gepard1 = new Animal("Gerd", "Gepard");

        bigCats.addAnimal(lionMale1);
        bigCats.addAnimal(lionFemale1);
        bigCats.addAnimal(gepard1);

        Animal chimpanzee1 = new Animal("Jeff", "Schimpanse");
        Animal chimpanzee2 = new Animal("Jerome", "Schimpanse");
        Animal orangutan1 = new Animal("Oskar", "Orang-Utan");

        monkeys.addAnimal(chimpanzee1);
        monkeys.addAnimal(chimpanzee2);
        monkeys.addAnimal(orangutan1);

        Animal greenMamba1 = new Animal("Max", "Grüne Mamba");
        Animal blindworm1 = new Animal("Berta", "Blindschleiche");
        Animal gecko1 = new Animal("Gustl", "Gecko");

        reptiles.addAnimal(greenMamba1);
        reptiles.addAnimal(blindworm1);
        reptiles.addAnimal(gecko1);

        Zookeeper johann = new Zookeeper("Johann", lionFemale1);
        Zookeeper johanna = new Zookeeper("Jahanna", gecko1);

        zoo.addZookeeper(johann);
        zoo.addZookeeper(johanna);

        johann.addCage(bigCats);
        johann.addCage(monkeys);
        johanna.addCage(reptiles);

        Veterinarian robert = new Veterinarian("Robert");

        zoo.addVet(robert);

        zoo.printStructure("");

        //Simulation
        for (int i = 0; i < 30; i++) {

            System.out.println("\nTAG " + (i + 1) + ":");
            zoo.startWorkday();
        }


    }
}
