package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[0]);
        //FileInputStream fis = new FileInputStream("c:/data1.txt");

        TreeMap<Character, Integer> myMap = new TreeMap<>();
        while (fis.available() > 0) {
            char tmp =  (char) fis.read();
            if (myMap.containsKey(tmp)) {
                myMap.put(tmp, myMap.get(tmp) + 1);
            }
            else myMap.put(tmp, 1);
        }
        fis.close();

        for (Map.Entry<Character, Integer> e: myMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
