package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        String nameFile1 = args[0];
        String nameFile2 = args[1];
        bufferedReader = new BufferedReader(new FileReader(nameFile1));
        bufferedWriter = new BufferedWriter(new FileWriter(nameFile2));
        List<String> list = new ArrayList<>();
        while (bufferedReader.ready()) {
            String buffStr = bufferedReader.readLine();
            String[] buff = buffStr.split(" ");
            for (String s1 : buff) {
                if (s1.length() > 6) {
                    list.add(s1);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                bufferedWriter.write(list.get(i));
            } else {
                bufferedWriter.write(list.get(i) + ",");
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
