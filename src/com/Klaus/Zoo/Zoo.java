package com.Klaus.Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Cage> cagesInZoo;

    public Zoo(String name) {
        this.name = name;
        this.cagesInZoo = new Vector<>();
    }

    public void addCage(Cage cage){
        cagesInZoo.add(cage);
    }

    public void printStructure(String prefix){
        System.out.println("Zoo: " + this.name);

        for (int i = 0; i < cagesInZoo.size(); i++) {
            System.out.print(prefix + "Gehege: ");
            cagesInZoo.get(i).printStructure("  " + prefix);
            System.out.println();
        }
    }



}
