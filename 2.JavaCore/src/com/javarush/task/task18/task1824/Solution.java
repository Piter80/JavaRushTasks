package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        List<BufferedReader> list = new ArrayList<>();
        boolean flag = false;
        String fileName = "";
        while (!flag) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName = scanner.nextLine().trim()))) {
                list.add(br);
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                flag = true;
            } catch (IOException e) {
            }
        }
    }
}