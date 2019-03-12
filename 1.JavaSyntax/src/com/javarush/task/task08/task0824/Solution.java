package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> ar = new ArrayList<>();

        Human grandPa1 = new Human("Вася", true, 77);
        Human grandPa2 = new Human("Ося", true, 77);
        Human grandMa1 = new Human("Люся", false, 77);
        Human grandMa2 = new Human("Бся", false, 77);


        Human father = new Human("Иб", true, 55);
        Human mother = new Human("Юю", false, 55);

        grandMa1.children.add(father);
        grandPa1.children.add(father);

        grandMa2.children.add(mother);
        grandPa2.children.add(mother);

        Human ch1 = new Human("h", false, 33);
        Human ch2 = new Human("j", true, 33);
        Human ch3 = new Human("u", false, 33);

        father.children.add(ch1);
        father.children.add(ch2);
        father.children.add(ch3);

        mother.children.add(ch1);
        mother.children.add(ch2);
        mother.children.add(ch3);

        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }




        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
