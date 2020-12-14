package com.Klaus.Zoo;

public class Veterinary {
    private String name;

    public Veterinary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printStructure(String prefix){
        System.out.println(prefix + this.name);
    }
}
