package com.javarush.task.task28.task2802;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/
public class Solution {
    public static class AmigoThreadFactory implements ThreadFactory{
        private static AtomicInteger factoryNum = new AtomicInteger(0);
        private  AtomicInteger threadNum = new AtomicInteger(0);
        private ThreadGroup currendGroup = Thread.currentThread().getThreadGroup();
        private int currentFactoryNum = 0;
        public AmigoThreadFactory() {
            currentFactoryNum =factoryNum.incrementAndGet();
        }

        @Override
        public Thread newThread(Runnable r) {
            threadNum.incrementAndGet();
            Thread t = new Thread(currendGroup, r);
            t.setDaemon(false);
            t.setPriority(Thread.NORM_PRIORITY);
            String name = currendGroup.getName()
                    +"-pool-"+currentFactoryNum
                    + "-thread-"
                    +threadNum.get();
            t.setName(name);
            System.out.println(name);
            return t;
        }
    }

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }
}
