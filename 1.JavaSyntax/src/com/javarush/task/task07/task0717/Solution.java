package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
           BufferedReader bro = new BufferedReader(new InputStreamReader(System.in));
              for (int i = 0; i < 10; i++) {
                 list.add(bro.readLine());
              }




        ArrayList<String> result = doubleValues(list);

        for (String s :
                result) {
            System.out.println(s);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }
        //напишите тут ваш код
        return list;
    }
}
