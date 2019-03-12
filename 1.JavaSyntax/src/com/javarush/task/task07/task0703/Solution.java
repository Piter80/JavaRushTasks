package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String string[] = new String[10];
        int i[] = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 10; j++) {
            string[j] = reader.readLine();
            i[j] = string[j].length();
            System.out.println(i[j]);
        }
        //напишите тут ваш код
    }
}
