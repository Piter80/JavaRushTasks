package com.javarush.task.task18.task1803;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 256; i++)
            map.put(i, 0);

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(fileName);
        while (fis.available() > 0) {
            Integer readedByte = fis.read();
            Integer count = map.get(readedByte);
            map.put(readedByte, count+1);
        }
        Integer max = Integer.MIN_VALUE;
        for (Integer i: map.values()) {
            if (i > max) max = i;
        }

        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() == max) System.out.print(e.getKey() + " ");
        }

        fis.close();
    }
}
