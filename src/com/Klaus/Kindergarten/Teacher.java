package com.Klaus.Kindergarten;

import java.util.Vector;

public class Teacher extends Person implements ISimulation {

    private int addsLuckinessLevel;

    public Teacher(String name, int addsLuckinessLevel) {
        super(name);
        this.addsLuckinessLevel = addsLuckinessLevel;
    }

    @Override
    public void doSimulation(Vector<Child> children) {
        Child unluckiestChild = null;
        int unluckiestChildLevel = Integer.MAX_VALUE;
        for (Child c :
                children) {
            if (c.getMood() < unluckiestChildLevel) {
                unluckiestChild = c;
                unluckiestChildLevel = c.getMood();
            }
        }

        unluckiestChild.setMood(unluckiestChildLevel + addsLuckinessLevel);

        System.out.println(this.name + " comforts " + unluckiestChild.getName() +
                " (+" + addsLuckinessLevel + ")");

    }
}
