package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Принимаем имя файла с консоли
        String string = null;//создаем строку куда положим имя файла
//
        string = reader.readLine();//кладем имя файла в переменную
//
        FileInputStream fileInputStream = new FileInputStream(string);//создаем объект потока
//в конструкторе объекта кладем имя файла
        int count = Integer.MAX_VALUE;// эта переменная нужна для определения какой байт больше

        while (fileInputStream.available() > 0){// пока еще байты остались делаем то то
            int data = fileInputStream.read();// считываем байты и кладем в переменную
            if (data < count){//тут если байт больше созданной нами переменной
                count = data;//то этой переменной присваиваем байт
            }
        }

        fileInputStream.close();//закрываем поток

        System.out.println(count);//выводим самый большой байт с потока
    }
}
