package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(100);
        print(Integer.valueOf(100));
    }

    public static void  print (int i){
        System.out.println("int");
    }

    public static void  print (Integer i){
        System.out.println("Integer");
    }
    //Напишите тут ваши методы
}
