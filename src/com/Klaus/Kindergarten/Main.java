package com.Klaus.Kindergarten;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<ISimulation> everyThingCanBeSimulated = new Vector<>();

        Kindergarten kindergarten = new Kindergarten("Zwergenhaus");
        everyThingCanBeSimulated.add(kindergarten.addChild("Irene"));
        everyThingCanBeSimulated.add(kindergarten.addChild("Klaus"));
        everyThingCanBeSimulated.add(kindergarten.addChild("Mihael"));
        everyThingCanBeSimulated.add(kindergarten.addTeacher("Pauline", 2));
        everyThingCanBeSimulated.add(kindergarten.addCat("Miau"));
        everyThingCanBeSimulated.add(kindergarten.addDog("Wau"));
        everyThingCanBeSimulated.add(kindergarten.addFish("Blub"));

        for (int i = 0; i < 5; i++) {
            for (ISimulation sim :
                    everyThingCanBeSimulated) {
                sim.doSimulation(kindergarten.getChildren());
            }
            System.out.println();
            kindergarten.printChildren();
            System.out.println();
        }






    }
}
