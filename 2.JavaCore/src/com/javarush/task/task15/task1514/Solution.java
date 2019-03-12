package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(7d, "Семь");
        labels.put(6d, "Шесть");
        labels.put(77d, "Семь1");
        labels.put(799d, "Семь2");
        labels.put(76d, "Семь3");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
