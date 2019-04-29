package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.

Информация по каждому товару хранится в отдельной строке.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(bfr.readLine())));
        String lineFromFile;
        String param = args[0]+ " ";


        while (true) {
            lineFromFile = bufferedReader.readLine();
            if ((lineFromFile.substring(0, param.length())).equals(param)) {
                break;
            }
        }
        bufferedReader.close();
        bfr.close();
        System.out.println(lineFromFile);
    }
}

