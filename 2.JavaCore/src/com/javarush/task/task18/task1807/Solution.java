package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());
        int count = 0;
        int tmp = ',';
        while (fis.available() > 0)
            if (fis.read() == tmp)
                count++;
        fis.close();
        System.out.println(count);
    }
}
