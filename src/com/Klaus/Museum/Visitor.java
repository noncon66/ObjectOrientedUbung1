package com.Klaus.Museum;

import java.util.Random;

public class Visitor {
private static Random random = new Random();

private String name;
private int age;
private String placeOfResidence;

    public Visitor(String name, int age, String placeOfResidence) {
        this.name = name;
        this.age = age;
        this.placeOfResidence = placeOfResidence;
    }

    public static Visitor generateVisitor(){
        String[] firstNames = {"Hans", "Doris", "Barbara", "Jakob", "Anna", "Klaus", "Julia", "Philipp", "Erna"};
        String[] lastNames = {"Maier", "Moser", "Gruber", "Müller", "Wagner", "Pichler", "Steiner", "Huber"};
        String[] places = {"Rankweil", "Dornbirn", "Lustenau", "Sibratsgfäll", "Fontanella", "Vandans", "Nenzing"};

        String name = firstNames[random.nextInt(firstNames.length)] + " " +
                lastNames[random.nextInt(lastNames.length)];
        int age = 18 + random.nextInt(80);
        String place = places[random.nextInt(places.length)];

        return new Visitor(name, age, place);
    }

    @Override
    public String toString() {
        return name + " (" + age + ") from " + placeOfResidence;
    }
}
