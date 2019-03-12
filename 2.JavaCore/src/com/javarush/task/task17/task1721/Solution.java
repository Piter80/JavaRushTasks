package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File all = new File(reader.readLine());
        File remove = new File(reader.readLine());
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(all));
        while (reader1.ready()) {
            allLines.add(reader1.readLine());
        }
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(remove));
        while (reader2.ready()) {
            forRemoveLines.add(reader2.readLine());
        }
        reader2.close();

        new Solution().joinData();

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
