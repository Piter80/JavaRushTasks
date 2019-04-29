package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            if (args[0].equals("-d") || args[0].equals("-u")) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String fileName = reader.readLine();
                reader.close();

                String text = null;
                StringBuilder sb = new StringBuilder();
                String lineSeparator = System.getProperty("line.separator");
                ArrayList<String> list = new ArrayList<>();

                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    if (args[0].equals("-d")) {
                        while ((text = br.readLine()) != null) {
                            if (!(text.substring(0, 8).trim().equals(args[1]))) {
                                list.add(text);
                            }
                        }
                    } else if (args[0].equals("-u")) {
                        while ((text = br.readLine()) != null) {
                            if (!(text.substring(0, 8).trim().equals(args[1]))) {
                                list.add(text);
                            } else {
                                list.add(sb.append(String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4])).toString());
                            }
                        }
                    }
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                    for (int i = 0; i < list.size(); i++) {
                        bw.write(list.get(i));
                        if (i != list.size() - 1) {
                            bw.write(lineSeparator);
                        }
                    }
                }
            }
        }
    }
}

