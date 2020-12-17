package com.Klaus.ZooThe2nd;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public void printStructure(String prefix){
        System.out.println(prefix + name);
    }
}
