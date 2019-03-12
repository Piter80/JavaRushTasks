package com.javarush.task.task15.task1522;

/**
 * Created by ux on 26.06.2018.
 */
public class Moon  implements Planet {
    private static Moon instance = null;

    public static Moon getInstance() {
        if (instance == null) instance = new Moon();
        return instance;
    }

    private Moon() {

    }
}
