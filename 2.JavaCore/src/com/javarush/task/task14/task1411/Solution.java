package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList <String> as = new ArrayList<>();

        do {
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")) {
                as.add(key);
            }
            else break;
        } while (true);
        //тут цикл по чтению ключей, пункт 1
        {
            for (String s : as) {
                if (s.equals("user")) person = new Person.User();
                else if (s.equals("loser")) person = new Person.Loser();
                else if (s.equals("coder")) person = new Person.Coder();
                else if (s.equals("proger")) person = new Person.Proger();
                doWork(person); //вызываем doWork
            }
        }
    }

    public static void doWork(Person person) {

        if (person instanceof  Person.User)  ((Person.User) person).live();
        else if (person instanceof  Person.Loser)  ((Person.Loser) person).doNothing();
        else if (person instanceof  Person.Coder) ((Person.Coder) person).coding();
        else if (person instanceof  Person.Proger) ((Person.Proger) person).enjoy();
    }
}
