package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer strT = new StringTokenizer(query,delimiter);
        while (strT.hasMoreTokens()){
            tokens.add(strT.nextToken());
        }
        return tokens.toArray(new String[0]);
    }
}
