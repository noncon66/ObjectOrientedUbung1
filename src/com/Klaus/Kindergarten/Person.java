package com.Klaus.Kindergarten;

public abstract class Person {
    protected String name;
    protected Kindergarten myKindi;

    public Person(String name) {
        this.name = name;
        myKindi = null;
    }

    public void setMyKindi(Kindergarten myKindi) {
        this.myKindi = myKindi;
    }


    public String getName() {
        return name;
    }
}
