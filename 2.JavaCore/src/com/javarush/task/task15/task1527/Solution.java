package com.javarush.task.task15.task1527;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.in;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bro = new BufferedReader(new InputStreamReader(in));
        String url = null;
        try {
            url = bro.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        url = url.substring(url.indexOf("?")+1);
        String[] ar = url.split("&");
        String obj = "0";
        for (String p : ar) {
            String[] tmp = p.split("=");
            if (tmp[0].equals("obj")) obj = tmp[1];
            System.out.print(tmp[0] + " ");
        }
        System.out.println();
        if (obj.equals("0")) ;
        else {
            try {
                alert(Double.parseDouble(obj));
            } catch (Exception e) {
                alert(obj.toString());
            }

        }
        //System.out.println(url);
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
