package com.Klaus.Kindergarten;

import java.util.Random;

public class Child extends Person implements ISimulation {
    private Random random = new Random();
    private int luckinessLevel;

    public Child(String name) {
        super(name);
        this.luckinessLevel = 0;
    }

    @Override
    public void doSimulation() {
        if (random.nextDouble() < 0.5) {
            play();
        } else {meetChild();}
    }

    public void play() {
        int gameOutcome = random.nextInt(10) - 5;
        this.luckinessLevel = this.luckinessLevel + gameOutcome;
        System.out.println(name + " has LuckinessLevel" + luckinessLevel + " now (" + gameOutcome + ")");
    }

    public void meetChild() {
        luckinessLevel = luckinessLevel++;
        System.out.println(this.name + " meets a child gets luckier");
    }

    public int getLuckinessLevel() {
        return luckinessLevel;
    }

    public void setLuckinessLevel(int luckinessLevel) {
        this.luckinessLevel = luckinessLevel;
    }


}
