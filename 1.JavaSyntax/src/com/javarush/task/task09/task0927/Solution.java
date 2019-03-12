package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> newMap = new HashMap<>();
        newMap.put("Васька1", new Cat("Васька1"));
        newMap.put("Васька2", new Cat("Васька2"));
        newMap.put("Васька3", new Cat("Васька3"));
        newMap.put("Васька4", new Cat("Васька4"));
        newMap.put("Васька5", new Cat("Васька5"));
        newMap.put("Васька6", new Cat("Васька6"));
        newMap.put("Васька7", new Cat("Васька7"));
        newMap.put("Васька8", new Cat("Васька8"));
        newMap.put("Васька9", new Cat("Васька9"));
        newMap.put("Васька10", new Cat("Васька10"));

        return newMap;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();

        for (Map.Entry<String, Cat> e: map.entrySet()) {
            set.add(e.getValue());
        }
        return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
