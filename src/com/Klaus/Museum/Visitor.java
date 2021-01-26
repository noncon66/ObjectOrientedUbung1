package com.Klaus.Museum;

import java.util.Random;

public class Visitor {
    private static Random random = new Random();

    private String name;
    private int age;
    private String placeOfResidence;
    private Museum currentMuseum;
    private Room currentRoom;
    private Artwork currentArtwork;

    public Visitor(String name, int age, String placeOfResidence) {
        this.name = name;
        this.age = age;
        this.placeOfResidence = placeOfResidence;
    }

    public static Visitor generateVisitor() {
        String[] firstNames = {"Hans", "Doris", "Barbara", "Jakob", "Anna", "Klaus", "Julia", "Philipp", "Erna"};
        String[] lastNames = {"Maier", "Moser", "Gruber", "Müller", "Wagner", "Pichler", "Steiner", "Huber"};
        String[] places = {"Rankweil", "Dornbirn", "Lustenau", "Sibratsgfäll", "Fontanella", "Vandans", "Nenzing"};

        String name = firstNames[random.nextInt(firstNames.length)] + " " +
                lastNames[random.nextInt(lastNames.length)];
        int age = 18 + random.nextInt(80);
        String place = places[random.nextInt(places.length)];

        return new Visitor(name, age, place);
    }

    public Room changeRoom() {
        Room newRoom = null;
        while (newRoom.equals(currentRoom)) {
            newRoom = currentMuseum.getRandomRoom();
        }
        currentRoom.addVisitor(this);
        currentRoom = newRoom;
        System.out.println(this.name + " geht in Raum " + currentRoom.getRoomNumber());
        return newRoom;
    }

    public Artwork changeArtwork() {
        Artwork newArtwork = null;
        while (newArtwork.equals(currentArtwork)) {
            newArtwork = currentRoom.getRandomArtwork();
        }
        currentArtwork = newArtwork;
        return newArtwork;
    }

    public void leaveMuseum() {
        currentMuseum.removeVisitor(this);
        currentRoom.removeVisitor(this);
        currentMuseum = null;
        currentRoom = null;
    }


    @Override
    public String toString() {
        return name + " (" + age + ") from " + placeOfResidence;
    }


//------------------ Getter + Setter --------------------

    public void setCurrentMuseum(Museum currentMuseum) {
        this.currentMuseum = currentMuseum;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setCurrentArtwork(Artwork currentArtwork) {
        this.currentArtwork = currentArtwork;
    }
}
