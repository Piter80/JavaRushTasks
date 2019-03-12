package com.javarush.task.task14.task1419;

import javax.management.openmbean.OpenDataException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.channels.FileLockInterruptionException;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
         List i = new ArrayList();
         i.get(0);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
         List<Integer> i = new ArrayList(-1);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
        String s = null;
            System.out.println(s.charAt(8));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
        String s = "ABZ";
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:/456.ttt")));
        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new NegativeArraySizeException());
            exceptions.add(new MissingFormatArgumentException("S"));
            exceptions.add(new FileLockInterruptionException());
            exceptions.add(new OpenDataException());
        }





        //напишите тут ваш код

    }
}
