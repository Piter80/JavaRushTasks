package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
            String[] wheels = loadWheelNamesFromDB();
            List<Wheel> myWheels = new ArrayList<>();
            for (int i = 0; i < wheels.length; i++)
                myWheels.add(Wheel.valueOf(wheels[i]));

            if (myWheels.size() != 4) throw new RuntimeException();
            this.wheels = myWheels;

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        for (Wheel w: car.wheels) {
            System.out.println(w.toString());

        }
    }
}
