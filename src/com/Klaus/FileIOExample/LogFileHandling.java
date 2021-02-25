package com.Klaus.FileIOExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class LogFileHandling {
    public static void main(String[] args) {
        String logFolder = "/Users/klaus/Desktop/Log/";
        String fileName = "log";
        String fileExtension = ".txt";
        int numberOfLogFiles = 10;
        String recentLogText = "recent log";
        String oldLogText = "old Log";
        Path recentLog = Paths.get(logFolder + fileName + fileExtension);

        if (logExists(logFolder, fileName, fileExtension)) {
            createRecent(logFolder, fileName, fileExtension);

        } else {
            //delete last file
            deleteLastIfExists(logFolder, fileName, fileExtension, numberOfLogFiles);

            int sourceIndex = numberOfLogFiles - 2;
            Path sourcePath = Paths.get(logFolder + fileName + sourceIndex + fileExtension);
            System.out.println("sourcePath: " + sourcePath.toString());
            //check if files exist and rename (move)
            while (sourceIndex > 0) {
                System.out.println();
                if (Files.exists(sourcePath)) {
                    int targetIndex = sourceIndex + 1;
                    Path targetPath = Paths.get(logFolder + fileName + targetIndex + fileExtension);
                    try {
                        Files.move(sourcePath, targetPath, REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                sourceIndex--;
                if (sourceIndex > 0) {
                    sourcePath = Paths.get(logFolder + fileName + sourceIndex + fileExtension);
                }
                System.out.println("sourcePath: " + sourcePath.toString());
            }

            //rename recent
            try {
                Files.move(recentLog, sourcePath, REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //create new recent


        }

    }

    static boolean logExists(String folder, String fileName, String extension){
        Path p = Paths.get(folder + fileName + extension);
        return Files.exists(p);
    }

    static void createRecent(String folder, String fileName, String extension) {
        Path path = Paths.get(folder + fileName + extension);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deleteLastIfExists(String folder, String fileName, String extension, int numberOfLogFiles) {
        int indexOfLast = numberOfLogFiles - 1;
        Path path = Paths.get(folder + fileName + indexOfLast + extension);
        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
