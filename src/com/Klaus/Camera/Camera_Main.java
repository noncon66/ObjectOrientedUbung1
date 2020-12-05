package com.Klaus.Camera;

public class Camera_Main {
    public static void main(String[] args) {

        Camera myNikon = new Camera("Nikon", 12.3f, "Japan", "xxx");
        Camera mySony = new Camera("Sony", 8.2f, "Taiwan", "yyy");

        System.out.println(myNikon.getDataSheet());
        System.out.println(mySony.getDataSheet());

        Lens myTamron = new Lens("Tamron", 10, 55);

        System.out.println(myTamron.toString());

        MemoryCard mySandisk = new MemoryCard("Sandisk", 64);
        MemoryCard mySonySD = new MemoryCard("Sony", 128);

        System.out.println(mySandisk.toString());
        System.out.println(mySonySD.toString());

        //add lens
        myNikon.setCurrentLens(myTamron);

        //all Memorycard
        myNikon.setCurrentMemorycard(mySandisk);

    }
}
