package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args){
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();
        int fourSpace = string.indexOf(" ");
        for (int i = 0; i < 3; i++) {
            fourSpace = string.indexOf(" ", fourSpace+1);
            if (fourSpace == -1) throw new TooShortStringException();
        }
        if ((fourSpace = string.indexOf(" ", fourSpace+1)) == -1) fourSpace = string.length();
        return string.substring(string.indexOf(" ")+1, fourSpace);
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
