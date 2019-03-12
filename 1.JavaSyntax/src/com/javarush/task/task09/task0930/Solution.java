package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Integer> digits = new ArrayList<Integer>();

        for (String x : array){
            //System.out.println(x);
            if (isNumber(x)) digits.add(Integer.parseInt(x));
            else strings.add(x);
        }

        Integer[] digitsSort = digits.toArray(new Integer[digits.size()]);
        Arrays.sort(digitsSort);

        String[] stringsSort = strings.toArray(new String[strings.size()]);



        for(int i = stringsSort.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(isGreaterThan(stringsSort[j],stringsSort[j+1])){
                    String tmp = stringsSort[j];
                    stringsSort[j] = stringsSort[j+1];
                    stringsSort[j+1] = tmp;
                }
            }
        }
        int i=digitsSort.length-1, j=0;
        for (int z=0; z<array.length; z++){
            if (isNumber(array[z])) {
                array[z] = digitsSort[i].toString();
                i--;
            }
            else {
                array[z]=stringsSort[j];
                j++;
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
