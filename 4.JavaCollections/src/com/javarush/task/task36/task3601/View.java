package com.javarush.task.task36.task3601;

public class View {
    private static Controller controller = new Controller();

    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }

}