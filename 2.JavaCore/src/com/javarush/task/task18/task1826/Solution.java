package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ArrayList<Integer> list = new ArrayList<>();
        int data;

        if (args[0].equals("-e")) {
            fis = new FileInputStream(args[1]);

            while ((data = fis.read()) != -1) {
                //data = fis.read();
                list.add(data + 1);
            }

            System.out.println(list.size());

            fos = new FileOutputStream(args[2]);
            for (int i = 0; i < list.size(); i++) {
                fos.write(list.get(i));
            }

        } else if (args[0].equals("-d")) {
            fis = new FileInputStream(args[1]);

            while ((data = fis.read()) != -1) {
                //data = fis.read();
                list.add(data - 1);
            }

            System.out.println(list.size());

            fos = new FileOutputStream(args[2]);
            for (int i = 0; i < list.size(); i++) {
                fos.write(list.get(i));
            }

        }
        fis.close();
        fos.close();
    }

}
