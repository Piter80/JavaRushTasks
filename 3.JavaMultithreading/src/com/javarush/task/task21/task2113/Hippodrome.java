package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse h: horses) {
            if (winner.getDistance() < h.getDistance()) winner = h;
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }


    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException{
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);

        }
    }
    public void move(){
        if (horses != null)
            horses.forEach(Horse::move);
    }
    public void print(){
        if (horses != null) {
            horses.forEach(Horse::print);
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
        }
    }

    public static void main(String[] args) throws Exception{
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Машка", 3, 0));
        horses.add(new Horse("Глашка", 3, 0));
        horses.add(new Horse("Дашка", 3, 0));

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();

    }
}
