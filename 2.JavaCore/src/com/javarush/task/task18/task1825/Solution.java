package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, String> files = new TreeMap<>(); //<Part, filePath>
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        String tmp;
        //<Добавляем в мап часть после последнего ".part" и полное имя файла>
        while (!(tmp = reader.readLine()).equals("end")) {
            fileName = tmp;
            files.put(fileName.split(".part")[fileName.split(".part").length-1], fileName);
        }
        reader.close();
        //<Случайное имя, которое он берет с последней прочитанной строки.>
        FileOutputStream fileWriter = new FileOutputStream(fileName.split(".part")[0],true);
        for (Map.Entry<String, String> pair : files.entrySet()) {
            FileInputStream fileReader = new FileInputStream(pair.getValue());
            byte[] buffer = new byte[fileReader.available()];
            fileReader.read(buffer);
            fileWriter.write(buffer);

            fileReader.close();
        }
        fileWriter.close();
        //<Потоки закрыты же?>
    }
}
