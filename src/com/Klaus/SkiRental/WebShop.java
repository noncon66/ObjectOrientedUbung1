package com.Klaus.SkiRental;

public class WebShop implements IProvider {
    private static WebShop instance;

    private WebShop(){

    }

    public static WebShop getInstance() {
        if (instance == null) {
            instance = new WebShop();
        }
        return instance;
    }


    @Override
    public boolean isAvailable(Category cat) {
        return false;
    }

    @Override
    public void request(Category cat) {

    }
}
