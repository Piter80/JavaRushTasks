package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        while (!filename.equals("exit")){
            new ReadThread(filename).start();
            filename = reader.readLine();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {

        public String file;

        public ReadThread(String fileName) {
            this.file = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            Integer tmp = 0;
            Integer win = 0;
            try {
                FileInputStream inputStream = new FileInputStream(file);
                while (inputStream.available() > 0) {
                    int a = inputStream.read();
                    if (map.containsKey(a))
                        map.put(a, map.get(a) + 1);
                    else
                        map.put(a, 1);
                }
                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    Integer key = pair.getKey();
                    Integer value = pair.getValue();
                    if (value > tmp && value > 0) {
                        win = key;
                        tmp = value;
                    }

                }
                synchronized (resultMap) {
                    resultMap.put(file, win);
                }
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
