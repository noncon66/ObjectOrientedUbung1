package com.Klaus;

public class FotoApperat {
    String exactName;
    int megaPixel;
    int focalLengthMin;
    int focalLengthMax;
    String countryOfOrigin;
    String owner;
    String functions;
    String dataSheet;

//Constructor


    public String getExactName() {
        return exactName;
    }

    public void setExactName(String exactName) {
        this.exactName = exactName;
    }

    public int getMegaPixel() {
        return megaPixel;
    }

    public void setMegaPixel(int megaPixel) {
        this.megaPixel = megaPixel;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        this.focalLengthMin = focalLengthMin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    public String getDataSheet() {
        dataSheet = exactName + '\n' +
                "Herkunftsland: " + countryOfOrigin + '\n' +
                "Besitzer: " + owner + '\n' +
                "Megapixel: " + megaPixel + '\n' +
                "Brennweite: " + focalLengthMin + " - " + focalLengthMax + '\n' +
                "Funtionen: " + functions;
        return dataSheet;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    public void setFocalLengthMax(int focalLengthMax) {
        this.focalLengthMax = focalLengthMax;
    }
}
