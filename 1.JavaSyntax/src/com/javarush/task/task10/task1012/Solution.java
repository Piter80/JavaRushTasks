package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>() {
        };
        int k = 0;

        for (int i = 0; i < abcArray.length; i++) {
            for (int j = 0; j <list.size(); j++) {
                String myString = list.get(j);
                char[] array = myString.toCharArray();
                for (int p = 0; p < array.length; p++)
                    if(array[p] == abcArray[i])
                        k++;
            }
            map.put(abcArray[i],k);
            k=0;
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());


        // напишите тут ваш код
    }

}
