package com.Klaus.SkiRental;

import java.io.*;

public class CSVNameListReader {
    public static String[] names(String filePath, String separator) {
        String[] namesList = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            while (bufferedReader.ready()) {
                String Line = bufferedReader.readLine();
                namesList = Line.split(separator);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return namesList;
    }
}
