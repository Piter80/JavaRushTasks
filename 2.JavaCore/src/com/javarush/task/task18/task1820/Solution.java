package com.javarush.task.task18.task1820;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
       String file1 = new BufferedReader((new InputStreamReader(System.in))).readLine();
        String file2 = new BufferedReader((new InputStreamReader(System.in))).readLine();
       /*String file1 = "c:/data1.txt";
       String file2 = "c:/data2.txt";*/

        BufferedReader fis1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedWriter fos2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
        String[] numbers = fis1.readLine().split(" ");
        for (int i = 0; i < numbers.length; i++) {
            int tmp = (int)Math.round(Double.parseDouble(numbers[i]));
            //System.out.println(tmp);
            fos2.write(tmp + " ");
        }

        fis1.close();
        fos2.close();


    }
}
