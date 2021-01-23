package com.Klaus.Museum;

import java.util.Vector;

public class Room {
    private int  roomNumber;
    private Vector<Artwork> artworks;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        artworks = new Vector<>();
    }

    public void addRandomArtwork(){
        this.artworks.add(Artwork.generateRandomArtwork());
    }

    public void printRoom(String prefix){
        System.out.println(prefix + "Room #" + roomNumber + ":");
        prefix = prefix + "  ";
        for (var a :
                artworks) {
            System.out.println(prefix + a.toString());
        }



    }


}
