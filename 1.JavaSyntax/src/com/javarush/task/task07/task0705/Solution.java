package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int large[] = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            large[i] = Integer.parseInt(reader.readLine());
        }

        int small1[] = new int[10];
        int small2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            small1[i] = large[i];
            small2[i] = large[i+10];
            System.out.println(small2[i]);
        }


        //напишите тут ваш код
    }
}
