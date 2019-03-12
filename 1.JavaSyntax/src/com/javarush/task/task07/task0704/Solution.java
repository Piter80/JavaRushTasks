package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int i[] = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int j = 0; j < 10; j++) {
            i[j] = Integer.parseInt(reader.readLine());
        }

        for (int j = 9; j >= 0 ; j--) {
            System.out.println(i[j]);
        }
        //напишите тут ваш код
    }
}

