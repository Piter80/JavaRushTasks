package com.javarush.task.task31.task3101;



import java.io.*;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);

        /*File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);

        File fileNameNew = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");


            FileUtils.renameFile(resultFileAbsolutePath, fileNameNew);


        Map<String, String> fileListMore50 = new TreeMap();
        Queue<File> allFiles = new PriorityQueue<>();

        Collections.addAll(allFiles, path.listFiles());

        while (!allFiles.isEmpty()) {
            File tempFile = allFiles.remove();
            if (tempFile.isDirectory()) {
                Collections.addAll(allFiles, tempFile.listFiles());
            } else {
                if (tempFile.length() <= 50) {
                    fileListMore50.put(tempFile.getName(), tempFile.getAbsolutePath());
                }
            }
        }

        *//*for (Map.Entry<String, String> pair : fileListMore50.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }*//*

        FileWriter fileWriter = new FileWriter(fileNameNew);
        for (Map.Entry<String, String> pair : fileListMore50.entrySet()) {
            try {
                FileReader fileReader = new FileReader(pair.getValue());
                String tempText = "";
                while (fileReader.ready()) {
                    int data = fileReader.read();
                    tempText += (char) data;
                }
                fileWriter.write(tempText + "\n");
                fileReader.close();
            } catch (FileNotFoundException e) {}
        }

        fileWriter.close();
    }*/
    }
}