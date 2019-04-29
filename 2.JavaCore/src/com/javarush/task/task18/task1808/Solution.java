package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());
        FileOutputStream fos1 = new FileOutputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());
        FileOutputStream fos2 = new FileOutputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());

        int fisSize = fis.available();
        while (fis.available() > 0) {
            if (fis.available() > fisSize/2) fos1.write(fis.read());
            else fos2.write(fis.read());
        }
        fis.close();
        fos1.close();
        fos2.close();

    }
}
