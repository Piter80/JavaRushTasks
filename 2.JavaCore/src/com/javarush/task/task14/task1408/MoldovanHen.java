package com.javarush.task.task14.task1408;

/**
 * Created by ux on 25.06.2018.
 */
public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - Moldova. Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
