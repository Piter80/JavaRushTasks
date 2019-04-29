package com.javarush.task.task14.task1417;

/**
 * Created by ux on 26.06.2018.
 */
public class Hrivna extends Money {
    public String getCurrencyName (){
        return "HRN";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
