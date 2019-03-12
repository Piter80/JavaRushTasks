package com.javarush.task.task15.task1522;

/**
 * Created by ux on 26.06.2018.
 */
public class Sun  implements Planet {
    private static Sun instance = null;

    public static Sun getInstance() {
        if (instance == null) instance = new Sun();
        return instance;
    }

    private Sun() {

    }
}
