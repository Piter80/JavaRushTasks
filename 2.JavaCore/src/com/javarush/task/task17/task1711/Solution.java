package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case ("-c") : synchronized (allPeople) {
                addPeople (args, formatDate);
                break;
            }
            case ("-u") : synchronized (allPeople) {
                updPeople (args, formatDate);
                break;
            }
            case ("-d") : synchronized (allPeople) {
                delPeople (args);
                break;
            }
            case ("-i") : synchronized (allPeople) {
                showPeople (args);
                break;
            }
        }



    }

    public static void addPeople (String[] args, SimpleDateFormat formatDate) throws ParseException {
        for (int i = 1; i < args.length; i+=3) {
            Person p = null;
            Date dt = formatDate.parse(args[i+2]);
            if (args[i+1] == "м") p = Person.createMale(args[i], dt);
            else p = Person.createFemale(args[i], dt);
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }
    }

    public static void updPeople (String[] args, SimpleDateFormat formatDate) throws ParseException {
        for (int i = 1; i < args.length; i+=4) {
            Person p = allPeople.get(Integer.parseInt(args[i]));
            Date dt = formatDate.parse(args[i+3]);
            p.setName(args[i+1]);
            p.setSex(args[i+2] == "м" ? Sex.MALE : Sex.FEMALE);
            p.setBirthDay(dt);
        }
    }

    public static void delPeople (String[] args) {
        for (int i = 1; i < args.length; i++) {
            Integer id = Integer.parseInt(args[i]);
            Person p = allPeople.get(id);
            p.setName(null);
            p.setSex(null);
            p.setBirthDay(null);
        }
    }

    public static void showPeople (String[] args) {
        for (int i = 1; i < args.length; i++) {
            Integer id = Integer.parseInt(args[i]);
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Person p = allPeople.get(id);
            String text = p.getName() + " " + (p.getSex() == Sex.MALE ? "м" : "ж") + " " + formatDate.format(p.getBirthDay());
            System.out.println(text);
        }
    }
}
