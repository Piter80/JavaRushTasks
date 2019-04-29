package com.javarush.task.task14.task1421;

/**
 * Created by ux on 26.06.2018.
 */
public class Singleton1 {
    private static Singleton1 ourInstance = new Singleton1();

    public static Singleton1 getInstance() {
        return ourInstance;
    }

    private Singleton1() {
    }
}
