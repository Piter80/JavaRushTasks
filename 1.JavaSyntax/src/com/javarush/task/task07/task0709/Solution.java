package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tmp = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (tmp > strings.get(i).length()) tmp = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == tmp) System.out.println(strings.get(i));
        }

        //напишите тут ваш код
    }
}
