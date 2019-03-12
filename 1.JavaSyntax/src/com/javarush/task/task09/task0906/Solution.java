package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String cls = Thread.currentThread().getStackTrace()[2].getClassName();
        String meth = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(cls + ": " + meth + ": " + s);
        //напишите тут ваш код
    }
}
