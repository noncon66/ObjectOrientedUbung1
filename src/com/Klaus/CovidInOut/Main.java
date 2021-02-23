package com.Klaus.CovidInOut;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<CovidData> data;
        Vector<String> countries;
        Vector<CaseAggregationDTO> topCountriesByCases = new Vector<>();
        String path = "/Users/klaus/IdeaProjects/ObjectOrientedUbung1/src/com/Klaus/CovidInOut/covid19.csv";
        String separator = ",";
        data = CovidData.convert(CSVFileReader.getCovidData(path, separator));
        countries = CovidData.getCountries(data);

        for (var country : countries) {
            topCountriesByCases.add(new CaseAggregationDTO(country));
        }

        for (var item : data) {
            for (var country : topCountriesByCases) {
                if (item.getCountry().equals(country.getCountry())) {
                    country.addCases(item.getCases());
                }

            }


        }


    }


}