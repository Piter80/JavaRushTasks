package com.javarush.task.task35.task3501;

public class GenericStatic {
    public static <T> T someStaticMethod(T genericObject) {
        System.out.println((T) genericObject);
        return (T) genericObject;
    }
}