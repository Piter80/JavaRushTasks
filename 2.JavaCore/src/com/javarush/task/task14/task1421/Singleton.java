package com.javarush.task.task14.task1421;

/**
 * Created by ux on 26.06.2018.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        this.instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
