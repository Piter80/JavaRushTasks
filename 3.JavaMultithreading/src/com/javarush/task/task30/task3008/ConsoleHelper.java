package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        boolean readFlag = false;
        String messageFromUser = "";
        while (!readFlag) {
            try {
                messageFromUser = bufferedReader.readLine();
                readFlag = true;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
                //e.printStackTrace();

            }
        }
        return messageFromUser;

    }

    public static int readInt() {
        boolean flag = false;
        int readedInt = 0;
        while (!flag) {
            try {
                readedInt = Integer.parseInt(readString());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
                //e.printStackTrace();
            }

        }
        return readedInt;
    }


}
