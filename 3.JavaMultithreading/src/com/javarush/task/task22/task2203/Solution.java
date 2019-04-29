package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException{
        if (string == null) throw new TooShortStringException();
        int secondTab = string.indexOf("\t");
        //for (int i = 0; i < 1; i++) {
            secondTab = string.indexOf("\t", secondTab+1);
            if (secondTab == -1) throw new TooShortStringException();
        //}
       // if ((fourSpace = string.indexOf(" ", fourSpace+1)) == -1) fourSpace = string.length();
        return string.substring(string.indexOf("\t")+1, secondTab);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
