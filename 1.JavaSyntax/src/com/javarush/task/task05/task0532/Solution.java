package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        int tmp;
           while (n >0) {
               tmp = Integer.parseInt(reader.readLine());
                if (tmp > maximum) maximum = tmp;
                n--;
            }



        //напишите тут ваш код

        System.out.println(maximum);
    }
}
