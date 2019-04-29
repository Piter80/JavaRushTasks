package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> treeMap = new TreeMap<>();

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //String f1 = bufferedReader.readLine();

        FileReader reader = new FileReader(args[0]);
        BufferedReader fr = new BufferedReader(reader);

        StringBuilder s = new StringBuilder("");
        while (fr.ready()) {
            String[] names = fr.readLine().split(" ");
            treeMap.put(names[0], (treeMap.containsKey(names[0]) ? treeMap.get(names[0]) + Double.parseDouble(names[1]) : Double.parseDouble(names[1])));
        }

        for (Map.Entry<String, Double> e: treeMap.entrySet()) {
            System.out.println(e.getKey()+" " + e.getValue());
        }

        reader.close();
        fr.close();
    }
}

