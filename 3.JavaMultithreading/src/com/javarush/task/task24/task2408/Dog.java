package com.javarush.task.task24.task2408;

import java.util.Date;

/*
В работе вам иногда будет нужно закастить класс к какому-нибудь другому классу, не интерфейсу :)))
Класс DogPet использует 2 класса - SuperDog и Dog, разберись с getName в классе DogPet
Так намного лучше, чем Copy+Paste!
 */
public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**
     * Логика метода say:
     * Если i < 1, то используя метод getName вывести на экран, что собака спит. Пример, " *** Шарик ***  спит."'
     * Иначе вывести фразу: "имя_собаки лает гааав! сегодняшняя_дата". Пример для i=3, " *** Тузик ***  лает гааав! 13-ноя-2013 Ср"
     * Для форматирования даты используйте formatter из класса SuperDog.
     * <p/>
     * <b>Пример вывода:</b>
     *  *** Барбос ***  лает гааааав! 13-ноя-2013 Ср
     *  *** Тузик ***  лает гаав! 13-ноя-2013 Ср
     *  *** Бобик ***  лает гааав! 13-ноя-2013 Ср
     * Мышь пищит.
     *  *** Шарик ***  спит.
     *
     * @param i количество букв 'а' в слове гав
     * @return экземпляр класса DogPet
     */
    public Sayable toSayable(final int i) {
       class DogPet extends SuperDog implements Sayable {
           private String getName() {
               return getSuperQuotes() + Dog.this.name + getSuperQuotes();
           }

           @Override
           public String say() {
               if (i < 1) return getName()+ " спит.";
               else {
                   StringBuilder sb = new StringBuilder(getName()).append(" лает г");
                   for (int j = 0; j < i; j++)
                       sb.append("а");
                   sb.append("в! ");
                   sb.append(formatter.format(new Date()));


                   return sb.toString();
               }
           }
       }
        return new DogPet();
    }

}