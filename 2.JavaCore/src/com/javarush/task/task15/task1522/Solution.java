package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/* 
Закрепляем паттерн Singleton
4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader bro = new BufferedReader(new InputStreamReader(in));
        String s = null;
        try {
            s = bro.readLine();
        } catch (IOException e) {
            //e.printStackTrace();
        }
        if (s.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        else if (s.equals(Planet.MOON)) thePlanet = Moon.getInstance();
        else if (s.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        else thePlanet = null;
        // implement step #5 here - реализуйте задание №5 тут
    }
}
