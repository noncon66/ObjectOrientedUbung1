package com.Klaus.Zoo;

public class Zoo_Main {
    public static void main(String[] args) {

        Zoo rapperswil = new Zoo("Rapperswil");

        Animal lionMale1 = rapperswil.createAnimal("Raubkatzen", "Leo", "Löwe", "Fleisch", 7);
        Animal lionFemale1 = rapperswil.createAnimal("Raubkatzen", "Leoni", "Löwe", "Fleisch", 5);
        Animal gepard1 = rapperswil.createAnimal("Raubkatzen", "Gerd", "Gepard", "Fleisch", 7);

        Animal chimpanzee1 = rapperswil.createAnimal("Affenhaus", "Jeff", "Schimpanse", "Bananen", 25);
        Animal chimpanzee2 = rapperswil.createAnimal("Affenhaus", "Jerome", "Schimpanse", "Salat", 4);
        Animal orangutan1 = rapperswil.createAnimal("Affenhaus", "Oskar", "Orang-Utan", "Bananen", 30);

        Animal greenMamba1 = rapperswil.createAnimal("Reptilienhaus", "Max", "Grüne Mamba", "Mäuse", 1);
        Animal blindworm1 = rapperswil.createAnimal("Reptilienhaus", "Berta", "Blindschleiche", "Eier", 1);
        Animal gecko1 = rapperswil.createAnimal("Reptilienhaus", "Gustl", "Gecko", "Eier", 2);

        rapperswil.searchAndCreateFood("Fleisch", "kg");
        rapperswil.searchAndCreateFood("Bananen", "Stk");
        rapperswil.searchAndCreateFood("Salat", "kg");
        rapperswil.searchAndCreateFood("Mäuse", "Stk");
        rapperswil.searchAndCreateFood("Eier", "Stk");

        rapperswil.searchAndCreateZookeeper("Johann", lionFemale1, new String[]{"Raubkatzen", "Affenhaus"});
        rapperswil.searchAndCreateZookeeper("Johanna", gecko1, new String[]{"Reptilienhaus"});











        //(String cagename, String animalname, String species, String favoriteFood, int foodDemand)

        /*
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
*/
        rapperswil.printStructure("  ");

    }
}
