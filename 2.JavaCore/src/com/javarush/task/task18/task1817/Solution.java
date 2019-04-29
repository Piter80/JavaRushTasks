package com.javarush.task.task18.task1817;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[0]);
        //FileInputStream fis = new FileInputStream("c:/data.txt");
        int spaces = 0;
        int sumbols = fis.available();
        while (fis.available() > 0)
            if (fis.read() == ' ')
                spaces++;
        fis.close();
        System.out.printf("%.2f",(double) spaces/(double)sumbols*100.0);
    }
}
