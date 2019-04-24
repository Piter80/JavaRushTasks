package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Иванов", "Вася");
        myMap.put("Иванов1", "Вася");
        myMap.put("Иванов2", "Федя");
        myMap.put("Иванов3", "Женя");
        myMap.put("Иванов4", "Вася");
        myMap.put("Иванов5", "Вася");
        myMap.put("Иванов6", "Вася");
        myMap.put("Иванов7", "Вася");
        myMap.put("Иванов8", "Вася");
        myMap.put("Иванов9", "Вася");
        //напишите тут ваш код

        return myMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
        Map<String, String> mapCopy = new HashMap<>(map);
        List<String> valueList = new ArrayList();

        for (Map.Entry<String, String> pair : mapCopy.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            valueList.add(value);// Заполнить значениями из Мап
        }
        for (int i = 0; i < valueList.size(); i++) {
            int count = 0;//создал счетчик для значения
            String valueTemp = valueList.get(i);//значение проверяю на повторение
            for (int j = 0; j < valueList.size(); j++) {
                if ( valueList.get(j).equals(valueTemp) ) {
                    count++;
                    if ( count > 1 ) removeItemFromMapByValue(map, valueTemp);
                }
            }
        }
//        for ( String s: valueList ) System.out.println(s);
//        System.out.println("================");

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
