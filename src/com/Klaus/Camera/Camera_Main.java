package com.Klaus.Camera;

public class Camera_Main {
    public static void main(String[] args) {

        Camera myNikon = new Camera("Nikon", 12.3f, "Japan", "xxx");
        Camera mySony = new Camera("Sony", 8.2f, "Taiwan", "yyy");

        System.out.println(myNikon.getDataSheet());
        System.out.println(mySony.getDataSheet());


    }

}
