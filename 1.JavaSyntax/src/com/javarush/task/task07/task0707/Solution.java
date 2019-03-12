package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a = new ArrayList<>();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        System.out.println(a.size());
        for (String s:
             a) {
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}
