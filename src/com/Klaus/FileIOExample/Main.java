package com.Klaus.FileIOExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        int i = 1;
        try {
            File helloWorld = new File("/Users/klaus/Desktop/helloWorld" + i + ".txt");
            while (!helloWorld.createNewFile()) {
                System.out.println("already exists: helloWorld" + i + ".txt");
                i++;
                helloWorld = new File("/Users/klaus/Desktop/helloWorld" + i + ".txt");

            }
            FileWriter myWriter = new FileWriter(helloWorld);
            myWriter.write("Hello World!");
            myWriter.close();
            System.out.println("File created: " + helloWorld.getPath());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

