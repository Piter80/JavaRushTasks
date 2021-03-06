package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();

    }
    public static class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }

}
