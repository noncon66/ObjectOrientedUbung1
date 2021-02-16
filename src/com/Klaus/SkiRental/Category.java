package com.Klaus.SkiRental;

public enum Category {
    HELMET, SKI, STICK, BOOTS, GOGGLES;

    public static double getPrice(Category cat) {
        switch (cat) {
            case HELMET:
                return 5.0;
            case SKI:
                return 10.0;
            case STICK:
                return 3.0;
            case BOOTS:
                return 7.0;
            case GOGGLES:
                return 2.0;
        }
        throw new IllegalArgumentException("unknown Item: " + cat);
    }
    }
