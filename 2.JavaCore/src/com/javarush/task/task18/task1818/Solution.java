package com.javarush.task.task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream(new BufferedReader((new InputStreamReader(System.in))).readLine(), true);
        FileInputStream fis = new FileInputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());
        FileInputStream fi2 = new FileInputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());

        while (fis.available() > 0)
            fos.write(fis.read());
        fis.close();
        while (fi2.available() > 0)
            fos.write(fi2.read());
        fi2.close();

        fos.close();



    }
}
