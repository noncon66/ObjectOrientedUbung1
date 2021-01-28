package com.Klaus.Museum;

import java.util.Random;

public class VisitorFactory {
    private static Random random = new Random();


    public static Visitor generateVisitor() {
        String[] firstNames = {"Hans", "Doris", "Barbara", "Jakob", "Anna", "Klaus", "Julia", "Philipp", "Erna"};
        String[] lastNames = {"Maier", "Moser", "Gruber", "Müller", "Wagner", "Pichler", "Steiner", "Huber"};
        String[] places = {"Rankweil", "Dornbirn", "Lustenau", "Sibratsgfäll", "Fontanella", "Vandans", "Nenzing"};
        String name = firstNames[random.nextInt(firstNames.length)] + " " +
                lastNames[random.nextInt(lastNames.length)];
        int age = 18 + random.nextInt(80);
        String place = places[random.nextInt(places.length)];

        double probability = random.nextDouble();

        if (probability<0.8) {
            return new Visitor(name, age, place);
        } else {
            Visitor newVisitor = generateVisitor();
            return new Thief(newVisitor.getName(), newVisitor.getAge(), newVisitor.getPlaceOfResidence());
        }
    }

    public static Guard generateGuard(){
        Visitor newVisitor = generateVisitor();
        return new Guard(newVisitor.getName(), newVisitor.getAge(), newVisitor.getPlaceOfResidence());

    }



}
