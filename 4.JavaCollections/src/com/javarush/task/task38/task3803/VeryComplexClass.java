package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object list = new ArrayList();
        TreeSet set = new TreeSet();

        list = (List) set;

    }

    public void methodThrowsNullPointerException() {
        File file = null;
        file.isDirectory();

    }

    public static void main(String[] args) {

    }
}
