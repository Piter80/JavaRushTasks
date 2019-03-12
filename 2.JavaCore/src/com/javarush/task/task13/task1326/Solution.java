package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();


        FileInputStream fis = new FileInputStream(fileName);
        reader = new BufferedReader(new InputStreamReader(fis));

        ArrayList<Integer> arr = new ArrayList<>();
        while (reader.ready()) {
            Integer i = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) arr.add(i);
        }
        fis.close();
        reader.close();
        Collections.sort(arr);

        for (Integer i : arr) {
            System.out.println(i);
        }
        // напишите тут ваш код
    }
}
