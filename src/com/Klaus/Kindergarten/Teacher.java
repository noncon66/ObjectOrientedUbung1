package com.Klaus.Kindergarten;

import java.util.Vector;

public class Teacher extends Person implements ISimulation {

    private int addsLuckinessLevel;

    public Teacher(String name, int addsLuckinessLevel) {
        super(name);
        this.addsLuckinessLevel = addsLuckinessLevel;
    }

    @Override
    public void doSimulation() {
        this.careForUnluckyChild();

    }

    public void careForUnluckyChild() {
        Vector<Child> children = myKindi.getChildren();
        Child unluckiestChild = null;
        int unluckiestChildLevel = Integer.MAX_VALUE;
        for (Child c :
                children) {
            if (c.getLuckinessLevel() < unluckiestChildLevel) {
                unluckiestChild = c;
                unluckiestChildLevel = c.getLuckinessLevel();
            }
        }

        unluckiestChild.setLuckinessLevel(unluckiestChildLevel + addsLuckinessLevel);

        System.out.println(this.name + "has rised the LuckinessLevel of " + unluckiestChild.getName() +
                " by " + addsLuckinessLevel + " to " + unluckiestChild.getLuckinessLevel());
    }
}
