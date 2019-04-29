package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.lang.reflect.Array;


public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());
        FileOutputStream fos1 = new FileOutputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());

        byte[] arr = new byte[fis.available()];
        fis.read(arr, 0, arr.length);
        for (int i = arr.length-1; i >= 0; i--)
            fos1.write(arr[i]);
        fis.close();
        fos1.close();

    }
}
