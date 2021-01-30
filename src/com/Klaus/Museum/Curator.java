package com.Klaus.Museum;

import java.util.Random;

public class Curator {
    private Random random = new Random();


    private final String name;
    private int collectedMoney;
    private Museum currentMuseum;

    public Curator() {
        this.name = "Karl Kustos";
        this.collectedMoney = 0;
        this.currentMuseum = null;
    }

    public void collectMoney() {
        int cm = 0;
        if (random.nextDouble() < 0.33) {
            cm = 100 + random.nextInt(900);
        }
        collectedMoney = collectedMoney + cm;
    }

    public Artwork buyArtwork() {
        Artwork artworkForSale = Artwork.generateRandomArtwork();
        if (artworkForSale.getPrice() <= collectedMoney) {
            collectedMoney = collectedMoney - artworkForSale.getPrice();
            return artworkForSale;
        }
        return null;
    }

    public void doYourJob(){
        collectMoney();
        Artwork boughtArtwork = buyArtwork();
        if (boughtArtwork != null){
            currentMuseum.addNewArtwork(boughtArtwork);
        }
    }


    public void setCurrentMuseum(Museum currentMuseum) {
        this.currentMuseum = currentMuseum;
    }
}
