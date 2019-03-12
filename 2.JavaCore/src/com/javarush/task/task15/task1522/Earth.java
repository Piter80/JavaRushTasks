package com.javarush.task.task15.task1522;

/**
 * Created by ux on 26.06.2018.
 */
public class Earth implements Planet {
    private static Earth instance = null;

    public static Earth getInstance() {
        if (instance == null) instance = new Earth();
        return instance;
    }

    private Earth() {

    }
}
