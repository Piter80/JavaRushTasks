package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> mySet = new TreeSet<>();
        FileInputStream fis = new FileInputStream((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        while (fis.available() > 0)
            mySet.add(fis.read());
        fis.close();
       /* List<Integer> list = new ArrayList<>();

        for (Integer i: mySet) {
            list.add(i);
        }
        Collections.sort(list);*/
        mySet.forEach(i -> System.out.print(i + " "));


    }
}
