package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Формируем WHERE
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap();
      /*  map.put("имя", "Иванов");
        map.put("страна", "Россия");*/
        map.put("город", null);

        System.out.println(getQuery(map));


    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<String, String> e:params.entrySet()) {
            String[] arr = {e.getKey(), e.getValue()};
            if (arr[0] != null && arr[1] != null) sb.append(arr[0] + " = '" + arr[1]+"' and ");
        }
        if (sb.length() > 5) sb.replace(sb.length()-5, sb.length(), "");
        return sb.toString();
    }
}
