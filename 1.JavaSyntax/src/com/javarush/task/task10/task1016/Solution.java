package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {

        HashMap<String, Integer> result = new HashMap<String, Integer>();

        ArrayList<String> list_tmp = new ArrayList<String>();
        ArrayList<String> list_tmp2 = new ArrayList<String>();
        list_tmp = (ArrayList<String>)list.clone();
        list_tmp2 = (ArrayList<String>)list.clone();
        String key = "";

        do {
            int typ = 0;
            key = list_tmp2.get(0);
            for (String str : list_tmp) {
                if (key.equals(str)) {
                    typ++;
                    list_tmp2.remove(str);
                }
            }

            result.put(key, typ);

            list_tmp = (ArrayList<String>)list_tmp2.clone();
        }
        while (list_tmp.size() != 0);


        return result;

    }

}

