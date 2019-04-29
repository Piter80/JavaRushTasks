package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Dish;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {

    public static void main(String[] args) throws Exception {
       // Cook cook = new Cook("Amigo");
        Tablet tablet = new Tablet(1);
        Cook firstCook = new Cook("Mumamba");
        Waiter waiter = new Waiter();
        firstCook.addObserver(waiter);
        tablet.addObserver(firstCook);
        tablet.createOrder();
    }

}
