package com.Klaus.Museum;

import java.util.Random;
import java.util.Vector;

public class Room implements IPrintStructure{
    private static Random random = new Random();

    private int  roomNumber;
    private Vector<Artwork> artworks;
    private Vector<Visitor> visitors;


    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        artworks = new Vector<>();
        visitors = new Vector<>();

    }

    public void addRandomArtwork(){
        this.artworks.add(Artwork.generateRandomArtwork());
    }

    public void printStructure(String prefix){
        System.out.println(prefix + "Room #" + roomNumber + ":");
        prefix = prefix + "  ";
        for (var a :
                artworks) {
            a.printStructure(prefix);
        }
    }

    public void removeArtwork(Artwork a){
        artworks.remove(a);
    }

    public void addVisitor(Visitor v){
        visitors.add(v);
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
        System.out.println("Kunstwerk im Raum " + getRoomNumber() + " ausgestellt!");
    }




    public Artwork getRandomArtwork(){
        return artworks.get(random.nextInt(artworks.size()));
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Vector<Visitor> getVisitors() {
        return visitors;
    }

}

