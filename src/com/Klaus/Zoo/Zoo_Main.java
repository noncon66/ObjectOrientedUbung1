package com.Klaus.Zoo;

public class Zoo_Main {
    public static void main(String[] args) {
        Zoo rapperswil = new Zoo("Rapperswil");

        Cage monkeys = new Cage("Affenhaus", rapperswil);
        Cage bigCats = new Cage("Raubkatzen", rapperswil);

        Animal lionMale = new Animal("Löwe", "Großkatze", bigCats);
        Animal lionFemale = new Animal("Löwin", "Großkatze", bigCats);
        Animal leopard = new Animal("Leopard", "Großkatze", bigCats);

        Animal chimpanzee = new Animal("Schimpanse", "Schimpansen", monkeys);
        Animal orangutan = new Animal("Orang-Utan", "Orang-Utans", monkeys);




    }
}
