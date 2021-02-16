package com.Klaus.SkiRental;


public interface IProvider {
    public boolean isAvailable (Category cat);
    public void request (Category cat);

}
