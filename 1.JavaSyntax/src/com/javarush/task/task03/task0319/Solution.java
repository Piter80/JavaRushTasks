package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int how = Integer.parseInt(bufferedReader.readLine());
        int time = Integer.parseInt(bufferedReader.readLine());

        System.out.println(name + " получает " + how + " через " + time + " лет.");
        //напишите тут ваш код "Имя" получает "число1" через "число2" лет.
    }
}
