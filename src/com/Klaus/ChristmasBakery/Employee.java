package com.Klaus.ChristmasBakery;

import java.util.Vector;

public class Employee {
    private String name;
    private String favouriteCookie;
    private Vector<Cookie> cookies;
    private int productionCapacityTotal;
    private int productionCapacityLeft;



    public Employee(String name, String favouriteCookie, String[] cookiesList, int productionCapacityTotal) {
        this.name = name;
        this.favouriteCookie = favouriteCookie;
        cookies = new Vector<>();
        for (var cookie :
                cookiesList) {
            addCookie(cookie);
            this.productionCapacityTotal = productionCapacityTotal;
            this.productionCapacityLeft = this.productionCapacityTotal;
        }
    }


    public void addCookie(String cookieName){
        cookies.add(new Cookie(cookieName));
    }

    public String getName() {
        return name;
    }
}
