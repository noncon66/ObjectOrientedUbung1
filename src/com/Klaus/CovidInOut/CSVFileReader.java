package com.Klaus.CovidInOut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class CSVFileReader {
    public static Vector<String[]> getCovidData(String filePath, String separator) {
        Vector<String[]> data = new Vector<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            while (bufferedReader.readLine() != null) {
                String line = bufferedReader.readLine();
                if (line != null) data.add(line.split(separator));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
