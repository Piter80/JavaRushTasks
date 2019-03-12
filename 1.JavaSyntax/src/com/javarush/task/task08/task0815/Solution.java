package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Бобров", "Окакий");
        map.put("Бобров1", "Окакий1");
        map.put("Бобров2", "Окакий2");
        map.put("Бобров3", "Окакий3");
        map.put("Бобров4", "Окакий4");
        map.put("Бобров5", "Окакий5");
        map.put("Бобров6", "Окакий6");
        map.put("Бобров7", "Окакий7");
        map.put("Бобров8", "Окакий8");
        map.put("Бобров9", "Окакий9");
        map.put("Бобров1", "Окакий1");

        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair:map.entrySet()) {
            if (pair.getValue().equals(name)) count++;
        }
        return count;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair:map.entrySet()) {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
