package com.Klaus.CovidInOut;

import com.Klaus.Logging.LogType;
import com.Klaus.Logging.SimpleLogger;

import java.util.Arrays;
import java.util.Vector;

public class CovidData {

    private String date;
    private int cases;
    private int deaths;
    private String country;
    private int population;
    private double incident14days;

    public CovidData(String[] lineFromCSV) {
        SimpleLogger logger = SimpleLogger.getInstance();
        this.date = lineFromCSV[0];
        this.cases = Integer.parseInt(lineFromCSV[4]);
        this.deaths = Integer.parseInt(lineFromCSV[5]);
        this.country = lineFromCSV[6];
        this.population = Integer.parseInt(lineFromCSV[9]);
        if (lineFromCSV.length >= 12) {
            this.incident14days = Double.parseDouble(lineFromCSV[11]);
        }
    }

    public static Vector<CovidData> convert(Vector<String[]> rawData) {
        SimpleLogger logger = SimpleLogger.getInstance();
        Vector<CovidData> data = new Vector<>();
        int i = 0;
        for (var line :
                rawData) {
            data.add(new CovidData(line));
            logger.log(LogType.INFO, Integer.toString(i) + " > " + Arrays.toString(line));
            i++;
        }
        return data;
    }

    public static Vector<String> getCountries(Vector<CovidData> data) {
        Vector<String> countries = new Vector<>();
        for (var item :
                data) {
            if (countries.contains(item.getCountry())) {
                countries.add(item.getCountry());
            }
        }
        return countries;
    }

    public String getCountry() {
        return country;
    }

    public int getCases() {
        return cases;
    }
}
