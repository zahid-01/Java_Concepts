package com.sudo.Runnable;

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;

class MyThread implements Runnable {
    public void run() {
        int counter = 1;
        do {
            System.out.println(counter++ + " My Thread");
        } while (counter < 100);
    }
}

class MyThread1 implements Runnable {
    public void run() {
        int counter = 1;
        do {
            System.out.println(counter++ + " Hakuna");
        } while (counter < 100);
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadGroup tt = new ThreadGroup("hi");

        MyThread myThread = new MyThread();
        Thread t = new Thread(tt, myThread);

        MyThread1 myThread1 = new MyThread1();
        Thread hakuna = new Thread(tt, myThread1);

        Thread[] threads = new Thread[]{t, hakuna};

        for (Thread ts: threads)
            ts.start();

        Thread.dumpStack();

        int counter = 1;
        do {
            if(counter == 50) t.interrupt();
            System.out.println(counter++ + " "+t.isInterrupted());
        } while (counter < 100);
    }
}
