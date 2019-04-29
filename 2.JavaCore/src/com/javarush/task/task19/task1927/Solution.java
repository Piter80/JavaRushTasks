package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream original = System.out;

        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bs));

        testString.printSomething();

        System.setOut(original);

        //BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bs.toByteArray())));
        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bs.toString().getBytes())));

        int counter = 1;

        while (reader.ready()) {
            String line = reader.readLine();

            System.out.println(line);

            if (counter % 2 == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }

            counter++;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
