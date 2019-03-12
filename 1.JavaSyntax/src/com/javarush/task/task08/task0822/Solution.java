package com.javarush.task.task08.task0822;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Set<Integer> set = new TreeSet<>();
        set.addAll(array);

        // find minimum here — найти минимум тут
        return set.iterator().next();
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tmp = Integer.parseInt(reader.readLine());
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < tmp; i++) {
            intList.add(Integer.parseInt(reader.readLine()));
        }

        //create and initialize a list here - создать и заполнить список тут
        return intList;
    }
}
