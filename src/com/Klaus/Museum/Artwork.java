package com.Klaus.Museum;

import com.Klaus.Logging.SimpleLogger;

import java.util.Random;

public class Artwork implements IPrintStructure{
    private static Random random = new Random();


    private String type;
    private String title;
    private String artist;
    private int yearOfOrigin;
    private int price;

    public Artwork(String type, String title, String artist, int yearOfOrigin, int price) {
        this.type = type;
        this.title = title;
        this.artist = artist;
        this.yearOfOrigin = yearOfOrigin;
        this.price = price;
    }

    public static Artwork generateRandomArtwork() {
        String[] types = {"Painting", "Drawing", "Sculture", "Statue", "Bust"};
        String[] titleAdjectives = {"Old", "Young", "Beautiful", "Strange", "Dark", "Sad", "Wild"};
        String[] titleNouns = {"House", "Man", "Woman", "Landscape", "Animal", "Boat", "Beach", "Lake"};
        String[] artists = {"Picasso", "van Gogh", "Monet", "Klimt", "Gauguin", "da Vinci"};

        String type = types[random.nextInt(types.length)];
        String title = titleAdjectives[random.nextInt(titleAdjectives.length)] + " " +
                titleNouns[random.nextInt(titleNouns.length)];
        String artist = artists[random.nextInt(artists.length)];
        int year = 1600 + random.nextInt(400);
        int price = 10000 + random.nextInt(100) * 1000;

        return new Artwork(type, title, artist, year, price);
    }

    @Override
    public String toString() {
        return "," + title + "' (" + type +  ") by " + artist + " (" + yearOfOrigin + ") Price: EUR " + price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "," + title + "' (" + type +  ") by " + artist + " (" + yearOfOrigin + ") Price: EUR " + price);
    }
}
