package com.javarush.task.task25.task2506;



public class LoggingStateThread extends Thread {
    private Thread thread;
    public LoggingStateThread(Thread t) {
        this.thread = t;
    }

    @Override
    public void run() {
        State currentState = null;
        while (true) {
            if (thread.getState() != currentState) {
                currentState = thread.getState();
                System.out.println(currentState);
            }
            if (currentState == State.TERMINATED) {
                break;
            }
        }
        interrupt();
    }

}
