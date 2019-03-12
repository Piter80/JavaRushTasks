package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int large[] = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            large[i] = Integer.parseInt(reader.readLine());
        }

        int tmp1 = 0;
        int tmp2 = 0;

        for (int i = 0; i < 15; i=i+2) {
                tmp1 += large[i];
        }

        for (int i = 1; i <= 14; i=i+2) {
                tmp2 += large[i];
        }

        if (tmp1 > tmp2) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
        //напишите тут ваш код
    }
}
