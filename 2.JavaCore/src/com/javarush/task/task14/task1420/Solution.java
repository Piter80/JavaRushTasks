package com.javarush.task.task14.task1420;

/* 
НОД
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nod;
        int a = 0, b = 0;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        if (a<=0||b<=0)
            throw new Exception();

        System.out.println(nod = gcd(a,b));
    }



        public static int gcd(int a,int b) {
            while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            return a;

    }
}
