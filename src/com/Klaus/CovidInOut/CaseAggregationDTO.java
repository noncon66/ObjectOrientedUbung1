package com.Klaus.CovidInOut;

public class CaseAggregationDTO {
    private String country;
    private int cases;

    public CaseAggregationDTO(String country) {
        this.country = country;
        this.cases = 0;
    }

    public String getCountry() {
        return country;
    }

    public void addCases(int cases){
        this.cases = this.cases + cases;
    }
}
