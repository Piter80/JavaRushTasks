package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr1 = new BufferedReader(new FileReader(br.readLine()));
        BufferedReader fr2 = new BufferedReader(new FileReader(br.readLine()));
        br.close();
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        while (fr1.ready()) {                  //Заполняем первый массив данными файла 1.
            a1.add(fr1.readLine());
        }
        while (fr2.ready()) {                  //Заполняем второй массив данными файла 2.
            a2.add(fr2.readLine());
        }
        if (a1.size() >= a2.size()) {          //Подгоним оба массива к одинаковому размеру на старте (добавим в конец пустые строки),
            while (a1.size() > a2.size()) {    //чтобы не выйти за границы в цикле.
                a2.add("");
            }
        } else {
            while (a2.size() > a1.size()) {
                a1.add("");
            }
        }
        a1.add("");              // Добавить ещё по пустой строке,
        a1.add("");              // Добавить ещё по пустой строке,
        a1.add("");              // Добавить ещё по пустой строке,
        a2.add("");              // если added или removed будут последними записями.
        a2.add("");              // если added или removed будут последними записями.
        a2.add("");              // если added или removed будут последними записями.
        fr1.close();
        fr2.close();

        for (int i = 0; i < Math.min(a1.size(), a2.size()); i++) {
            if (a1.get(i).equals(a2.get(i))) {
                if (!a2.get(i).equals("")) {
                    lines.add(new LineItem(Type.SAME, a1.get(i)));
                }
            } else if ((a1.get(i + 1).equals(a2.get(i)))) {
                lines.add(new LineItem(Type.REMOVED, a1.get(i)));
                a2.add(i, "Removed");      // Фиктивная запись, чтобы выровнять индекс.
            } else if ((a1.get(i).equals(a2.get(i + 1))) || a2.get(i + 1).equals("")) {
                lines.add(new LineItem(Type.ADDED, a2.get(i)));
                a1.add(i, "Added");        // Фиктивная запись, чтобы выровнять индекс.
            }

        }
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i).type + " " + lines.get(i).line);
        }


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}