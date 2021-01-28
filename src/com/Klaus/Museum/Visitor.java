package com.Klaus.Museum;

import java.util.Random;

public class Visitor {
    private static Random random = new Random();

    protected String name;
    protected int age;
    protected String placeOfResidence;
    protected Museum currentMuseum;
    protected Room currentRoom;
    protected Artwork currentArtwork;

    public Visitor(String name, int age, String placeOfResidence) {
        this.name = name;
        this.age = age;
        this.placeOfResidence = placeOfResidence;
    }

    public Room changeRoom() {
        Room newRoom;
        do {
            newRoom = currentMuseum.getRandomRoom();
        } while (newRoom.equals(currentRoom));

        currentRoom = newRoom;
        currentRoom.addVisitor(this);
        System.out.println(this.toStringShort() + " geht in Raum " + currentRoom.getRoomNumber());
        changeArtwork();
        return newRoom;

    }

    public Artwork changeArtwork() {
        Artwork newArtwork;
        do {
            newArtwork = currentRoom.getRandomArtwork();
        } while (newArtwork.equals(currentArtwork));

        currentArtwork = newArtwork;
        System.out.println(this.toStringShort() + " schaut jetzt \"" + currentArtwork.getTitle() + "\" an");
        return newArtwork;
    }

    public void leaveMuseum() {
        currentMuseum = null;
        currentRoom = null;
        System.out.println(this.toStringShort() + " verlässt das Museum");
    }

    public void doSomething() {
        double r = random.nextDouble();
        if (r <= 0.4) {
            changeRoom();
        } else if ((r > 0.4) & (r <= 0.8)) {
            changeArtwork();
        } else if ((r > 0.8) & (r < 1)) {
            leaveMuseum();
        }

    }


    @Override
    public String toString() {
        return name + " (" + age + ") aus " + placeOfResidence;
    }

    public String toStringShort() {
        return name ;
    }


//------------------ Getter + Setter --------------------


    public Museum getCurrentMuseum() {
        return currentMuseum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setCurrentMuseum(Museum currentMuseum) {
        this.currentMuseum = currentMuseum;
    }



}
