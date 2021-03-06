package com.ozdemir;

import static com.ozdemir.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + "Hello from the main thread");

        Thread anotherThread = new AnotherThread ();
        anotherThread.start();

        new Thread () {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        Thread myRunnableThread2 = new Thread(new MyRunnable(){
            @Override
            public void run() {
                super.run();
                try {
                    anotherThread.join();
                    System.out.println("Another thread is terminated. So i am awake again");
                } catch (InterruptedException e){
                    System.out.println("RunnableThread2 is interrupted");
                }
            }
        });

        Thread myThread = new Thread (() -> System.out.println("Runnable anonymous class"));

        myThread.start();

        myRunnableThread2.start();

 //       anotherThread.interrupt();;

    }
}
