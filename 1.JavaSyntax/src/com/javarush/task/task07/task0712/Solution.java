package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++){
            if (maxLength < list.get(i).length()){
                maxLength = list.get(i).length();
            }
        }
        for (int i = 1; i < list.size(); i++){
            if (minLength > list.get(i).length()){
                minLength = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == minLength){
                System.out.println(list.get(i));
                break;
            }
            else if (list.get(i).length() == maxLength){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}