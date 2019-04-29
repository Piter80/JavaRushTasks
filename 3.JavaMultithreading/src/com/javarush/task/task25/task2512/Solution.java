package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Throwable throwable = e;
        if (throwable != null) {
            uncaughtException(t, throwable.getCause());
            t.interrupt();
            System.out.println(throwable);
        }



    }

    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                throw new RuntimeException("ABC", new Exception("DEF", new IllegalAccessException("GHI")));
            }
        };
        t.setUncaughtExceptionHandler(new Solution());
        t.start();

    }
}
