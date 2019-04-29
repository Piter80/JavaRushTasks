package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args)throws Exception {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()){
            String name ="";
            String date ="";
            String s = reader.readLine();
            if(!s.isEmpty()) {
                String[] array = s.split(" ");
                for (int i = 0 ; i < array.length;i++){
                    if (!array[i].matches("[-+]?\\d+")){
                        name+=array[i]+" ";
                    }else{
                        date+=array[i]+" ";
                    }
                }
                Date date1 = new SimpleDateFormat("dd MM yyyy").parse(date);
                PEOPLE.add(new Person(name.trim(), date1));
            }
        }
        reader.close();
    }
}
