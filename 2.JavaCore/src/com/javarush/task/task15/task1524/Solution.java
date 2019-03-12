package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
Исправить порядок инициализации данных так, чтобы результат был следующим:









6
First name
*/

public class Solution {
    //1.static void init()
    public static void init() {
        System.out.println("static void init()");
    }
    static {init();}
    //2.Static block
    static {
        System.out.println("Static block");
    }
    //4non-static block
    {
        System.out.println("non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    //7Solution constructor
    public Solution() {
        System.out.println("Solution constructor");
        //89static void printAllFields
        printAllFields(this);
    }



    public static void main(String[] args) {
        //3public static void main
        System.out.println("public static void main");
        //4static void printAllFields
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        //5.0
        System.out.println(obj.i);
        //6.null
        System.out.println(obj.name);
    }
}
