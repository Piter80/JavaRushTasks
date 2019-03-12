package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/
public class Solution {
    public static void main(String[] args) throws IOException {
           BufferedReader bro = new BufferedReader(new InputStreamReader(System.in));
           ArrayList<Integer> strings = new ArrayList<>();
           for (int i = 0; i < 10; i++) {
                 strings.add(Integer.parseInt(bro.readLine()));
           }
            int tmp2 = 0;
            int tmp1 = 0;
           int count1 = 1, count2 = 0;
           for (int i:strings) {
              tmp1 = i;

            if (tmp2 == tmp1) count1++;
            else count1 = 1;
            if (count1 > count2){ count2 = count1;

            }
               tmp2 = i;

        }
        System.out.println(count2);
               //напишите тут ваш код

    }
}