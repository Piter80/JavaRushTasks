package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) strings.add(reader.readLine());

        for (int i = 0; i < 13; i++) {
            strings.add(0, strings.get(strings.size()-1));
            strings.remove(strings.size()-1);
        }

        for (String s:
                strings
             ) {
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}
