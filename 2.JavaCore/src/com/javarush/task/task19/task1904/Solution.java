package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/* 
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.



5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] arr = fileScanner.nextLine().split(" ");
            int day = Integer.parseInt(arr[3]);
            int month = Integer.parseInt(arr[4])-1;
            int year = Integer.parseInt(arr[5])-1900;
            String fName = arr[1];
            String mName = arr[2];
            String lName = arr[0];

            Date date = new Date(year, month, day);
            Person p = new Person(fName,mName, lName, date);
            return p;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
