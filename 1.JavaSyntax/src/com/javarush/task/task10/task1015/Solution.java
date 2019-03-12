package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()  {

        ArrayList<String>[] arr = new ArrayList[2];
        ArrayList<String> list = new ArrayList<>();
        list.add("sdfadf");
        list.add("sdfadf");

        arr[0] = new ArrayList<>();
        arr[0] = list;

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("sdfadf");
        list1.add("sdfadf");

        arr[1] = new ArrayList<>();
        arr[1] = list1;

        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}