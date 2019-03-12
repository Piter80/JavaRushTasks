package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        String tmp = "";
        while (!tmp.equals("exit" + "\n")) {
            tmp = reader.readLine() + "\n";
            bw.write(tmp);
            bw.flush();
        }
        reader.close();
        bw.close();
        // напишите тут ваш код
    }
}
