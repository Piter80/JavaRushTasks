package com.javarush.task.task18.task1819;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/
public class Solution {
    public static void main(String[] args) throws Exception{
        String file1 = new BufferedReader((new InputStreamReader(System.in))).readLine();
        String file2 = new BufferedReader((new InputStreamReader(System.in))).readLine();
      /* String file1 = "c:/data1.txt";
       String file2 = "c:/data2.txt";*/

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte b1[] = new byte[fis1.available()];
        byte b2[] = new byte[fis2.available()];
        while (fis2.available() > 0)
            fis2.read(b2);
        fis2.close();
        while (fis1.available() > 0)
            fis1.read(b1);
        fis1.close();

        FileOutputStream fos = new FileOutputStream(file1);
        fos.write(b2);
        fos.write(b1);
        fos.close();
    }
}
