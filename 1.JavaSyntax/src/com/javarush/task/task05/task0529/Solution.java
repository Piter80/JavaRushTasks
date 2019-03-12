package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = reader.readLine();
        int num = 0;
        while (!tmp.equals("сумма")) {
            num += Integer.parseInt(tmp);
            tmp = reader.readLine();
        }

        System.out.println(num);//напишите тут ваш код
    }
}
