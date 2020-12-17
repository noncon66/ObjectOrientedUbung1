package com.Klaus.ZooThe2nd;

import java.util.Vector;

public class Zoo2 {
    private String name;
    private Vector<Cage> cages;

    public Zoo2(String name) {
        this.name = name;
        this.cages = new Vector<>();
    }

    public void addCage(Cage cage){
        cages.add(cage);
    }
    
    public void printStructure(String prefix){
        System.out.println("Zoo: " + name);
        for (Cage c :
                cages) {
            c.printStructure("  " + prefix);
        }
    }
}
