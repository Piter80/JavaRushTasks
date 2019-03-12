package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tmp = -1;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (tmp < strings.get(i).length()) tmp = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == tmp) System.out.println(strings.get(i));
        }



        //напишите тут ваш код
    }
}
