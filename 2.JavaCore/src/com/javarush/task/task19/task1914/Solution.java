package com.javarush.task.task19.task1914;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9


*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);

        testString.printSomething();

        String[] result = byteArrayOutputStream.toString().split(" ");
        int i1 = Integer.parseInt(result[0]);
        int i2 = Integer.parseInt(result[2]);
        int ansver = 0;
        if (result[1].equals("+")) ansver = i1+i2;
        if (result[1].equals("-")) ansver = i1-i2;
        if (result[1].equals("*")) ansver = i1*i2;
        System.setOut(printStream);
        System.out.println(byteArrayOutputStream.toString().trim()+" " + ansver);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

