package com.javarush.task.task14.task1408;

/**
 * Created by ux on 25.06.2018.
 */
public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 90;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - Belarus. Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
