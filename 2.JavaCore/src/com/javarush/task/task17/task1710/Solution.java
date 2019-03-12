package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case ("-c") : {
                addPeople (args, formatDate);
                break;
            }
            case ("-u") : {
                updPeople (args, formatDate);
                break;
            }
            case ("-d") : {
                delPeople (Integer.parseInt(args[1]));
                break;
            }
            case ("-i") : {
                showPeople (Integer.parseInt(args[1]));
                break;
            }
        }



    }

    public static void addPeople (String[] args, SimpleDateFormat formatDate) throws ParseException{

        Person p = null;
        Date dt = formatDate.parse(args[3]);
        if (args[2] == "м") p = Person.createMale(args[1], dt);
        else p = Person.createFemale(args[1], dt);
        allPeople.add(p);
        System.out.println(allPeople.size()-1);
    }

    public static void updPeople (String[] args, SimpleDateFormat formatDate) throws ParseException {
        //-u id name sex bd
        Person p = allPeople.get(Integer.parseInt(args[1]));
        Date dt = formatDate.parse(args[4]);
        p.setName(args[2]);
        p.setSex(args[3] == "м" ? Sex.MALE : Sex.FEMALE);
        p.setBirthDay(dt);
    }

    public static void delPeople (Integer id) {
        Person p = allPeople.get(id);
        p.setName(null);
        p.setSex(null);
        p.setBirthDay(null);
    }

    public static void showPeople (Integer id) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person p = allPeople.get(id);
        String text = p.getName() + " " + (p.getSex() == Sex.MALE ? "м" : "ж") + " " + formatDate.format(p.getBirthDay());
        System.out.println(text);
    }
}
