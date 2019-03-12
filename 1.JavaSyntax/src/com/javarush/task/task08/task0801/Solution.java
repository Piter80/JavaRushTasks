package com.javarush.task.task08.task0801;

/* 
HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) System.out.println(iterator.next().toString());

        //напишите тут ваш код

    }
}
