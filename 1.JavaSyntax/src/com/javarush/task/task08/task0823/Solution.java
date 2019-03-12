package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] as =  s.split(" ");
        for (int i = 0; i < as.length; i++) {
            if (as[i].length() != 0) {
                as[i] = as[i].substring(0, 1).toUpperCase() + as[i].substring(1);
            }
            System.out.print(as[i] + " ");
        }
        //напишите тут ваш код
    }
}
