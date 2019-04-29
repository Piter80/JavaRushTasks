package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:/1.txt")));
        reader.readLine();

        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
