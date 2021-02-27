package com.Klaus.FileIOExample;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class FilePickerAndReader {
    public static void main(String[] args) {

        String charset = "UTF-8";
        Scanner sc = new Scanner(System.in);
        String filename;
        String BASE_PATH = "/Users/klaus/IdeaProjects/ObjectOrientedUbung1/src/com/Klaus/FileIO/SampleFiles/";
        Path bp = Paths.get(BASE_PATH);
        try {
            Stream stream = Files.list(bp);
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Bitte Dateinamen eingeben:");
        filename = sc.next();

        if (filename.contains("testfile")) {
            handleTestfiles(charset, filename, BASE_PATH);
        } else if (filename.contains("config")) {
            getConfig(filename, BASE_PATH);


        }
    }

    private static void handleTestfiles(String charset, String filename, String BASE_PATH) {
        Path p = Paths.get(BASE_PATH + filename);

        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(p.toFile()), charset)
            );
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static HashMap<String, Object> getConfig(String filename, String BASE_PATH) {
        Path filePath = Paths.get(BASE_PATH + filename);
        File configFile = new File(filePath.toString());
        HashMap<String, Object> config = new HashMap<>();
        try {
            Scanner configReader = new Scanner(configFile);
            while (configReader.hasNextLine()) {
                String line = configReader.nextLine();
                if (line != "" && line != null) //skip empty line
                    if (line.charAt(0) != ';') { //skip line that start with ";"
                        line = line.replaceAll("\\s+", ""); //remove spaces
                        String[] kvPair = line.split("=");
                        if (kvPair.length > 1)
                            config.put(kvPair[0], stringToObject(kvPair[1]));
                        else config.put(kvPair[0], "");
                    }
            }

            System.out.println(config.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return config;
    }

    public static Object stringToObject(String str) {
        if (isBoolean(str)) {
            return Boolean.parseBoolean(str);
        }
        if (isInteger(str)) {
            return Integer.parseInt(str);
        }
        if (isDouble(str)) {
            return Double.parseDouble(str);
        } else return str;
    }


    private static boolean isBoolean(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("true") || str.equals("false")) {
            return true;
        } else return false;

    }

    private static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer i = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static boolean isDouble(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


}
