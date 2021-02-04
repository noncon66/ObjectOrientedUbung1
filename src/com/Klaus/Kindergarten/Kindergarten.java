package com.Klaus.Kindergarten;

import java.util.PriorityQueue;
import java.util.Vector;

public class Kindergarten {
    private String name;
    private Vector<Teacher> teachers;
    private Vector<Child> children;
    private Cat cat;
    private Dog dog;
    private Fish fish;

    public Kindergarten (String name){
        this.name = name;
        teachers = new Vector<>();
        children = new Vector<>();
        cat = null;
        dog = null;
        fish = null;
    }


    public Vector<Child> getChildren() {
        return children;
    }
}
