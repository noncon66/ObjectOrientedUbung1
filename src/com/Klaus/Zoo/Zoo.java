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
        cage.addZoo(this);
    }

    public void printStructure(){



    }



}
