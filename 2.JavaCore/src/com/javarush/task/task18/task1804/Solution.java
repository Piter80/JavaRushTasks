package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte[] batyarray = new byte[256];
        int min = 1;
        while (fis.available() > 0)batyarray[fis.read()]++;
        fis.close();
        for (int i = 0; i < batyarray.length; i++) if (batyarray[i] == min) System.out.print(i + " ");
    }
}
