package com.javarush.task.task14.task1417;

/**
 * Created by ux on 26.06.2018.
 */
public class Ruble extends Money {
    public String getCurrencyName (){
        return "RUB";
    }

    public Ruble (double amount) {
        super(amount);
    }
}
