package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String address;
        private String name;
        private long money;
        private int heigth;
        private int age;
        private boolean sex;

        public Human(String address, String name, long money, int heigth, int age, boolean sex) {
            this.address = address;
            this.name = name;
            this.money = money;
            this.heigth = heigth;
            this.age = age;
            this.sex = sex;
        }
        public Human(String address, String name, int heigth, int age) {
            this.address = address;
            this.name = name;
            this.money = money;
            this.heigth = heigth;
            this.age = age;
            this.sex = sex;
        }
        public Human(String address, String name, int heigth, int age, boolean sex) {
            this.address = address;
            this.name = name;

            this.heigth = heigth;
            this.age = age;
            this.sex = sex;
        }
        public Human(String address, String name, long money) {
            this.address = address;
            this.name = name;
            this.money = money;
            this.heigth = heigth;
            this.age = age;
            this.sex = sex;
        }
        public Human(String address, String name, long money, int heigth) {
            this.address = address;
            this.name = name;
            this.money = money;
            this.heigth = heigth;

        }
        public Human(String address, String name, long money, int heigth, int age) {
            this.address = address;
            this.name = name;
            this.money = money;
            this.heigth = heigth;
            this.age = age;

        }
        public Human(long money) {
             this.money = money;
        }
        public Human(boolean sex) {

            this.sex = sex;
        }
        public Human(String address, String name) {
            this.address = address;
            this.name = name;

        }
        public Human(String address) {
            this.address = address;

        }

        // напишите тут ваши переменные и конструкторы
    }
}
