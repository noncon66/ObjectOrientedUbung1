package com.Klaus.Kindergarten;

import java.util.Random;
import java.util.Vector;

public class Child extends Person implements ISimulation {
    private Random random = new Random();
    private int mood;

    public Child(String name) {
        super(name);
        this.mood = 0;
    }

    @Override
    public void doSimulation(Vector<Child> children) {
        if (random.nextDouble() < 0.5) {
            play();
        } else {
            meetChild(children);
        }
    }

    public void play() {
        int gameOutcome = random.nextInt(10) - 5;
        this.mood = this.mood + gameOutcome;
        System.out.print(name + " plays a game and ");
        if (gameOutcome < 0) System.out.println("looses (" + gameOutcome + ")");
        else System.out.println("wins (" + gameOutcome + ")");
    }

    public void meetChild(Vector<Child> children) {
        var otherChild = children.elementAt(random.nextInt(children.size()));
        while (!this.equals(otherChild)) {
            mood = mood++;
            System.out.println(this.name + " meets " + otherChild.getName() + " and gets happier (+1)");
            break;
        }
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }


}
