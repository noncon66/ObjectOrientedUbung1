package com.Klaus.Kindergarten;

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

    public Child addChild (String name){
        Child c = new Child(name);
        children.add(c);
        return c;
    }

    public Teacher addTeacher (String name, int mood){
        Teacher t = new Teacher(name, mood);
        teachers.add(t);
        return t;
    }

    public Cat addCat (String name){
        cat = new Cat(name);
        return cat;
    }

    public Dog addDog (String name){
        dog = new Dog(name);
        return dog;
    }

    public Fish addFish (String name){
        fish = new Fish(name);
        return fish;
    }

    public Vector<Child> getChildren() {
        return children;
    }

    public void printChildren(){
        for (var c :
                children) {
            System.out.println(c.getName() + " (" + c.getMood()+ ")");
        }


    }



}
