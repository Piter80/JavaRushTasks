package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    String name = null;
    int age = 5;
    int weight = 5;
    String color = "brown";
    String address = null;

    public Cat (String name){
        this.name = name;
    }

    public Cat (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
