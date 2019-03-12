package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized (Thread.currentThread()) {
            if (imf instanceof IMF) {}
            else imf = new IMF();
        }
        //add your code here - добавь код тут
        return imf;
    }

    private IMF() {
    }
}
