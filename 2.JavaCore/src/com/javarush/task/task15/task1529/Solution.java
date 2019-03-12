package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/* 

3.3. Если параметр равен "plane", то считать второй параметр типа int(количество пассажиров), статическому объекту Flyable result присвоить объект класса Plane.
4. В статическом блоке инициализировать Flyable result вызвав метод reset.
5. Закрыть поток ввода методом close().
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }


    public static Flyable result;

    public static void reset() {
        BufferedReader bro = new BufferedReader(new InputStreamReader(in));

        try {
            String tmp = bro.readLine();
            if (tmp.equals("helicopter")) result = new Helicopter();
            else if (tmp.equals("plane"))  result = new Plane(Integer.parseInt(bro.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //add your code here - добавьте код тут
    }
}
