package com.sudo.Runnable;

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
        Thread t = new Thread(myThread);

        MyThread1 myThread1 = new MyThread1();
        Thread hakuna = new Thread(myThread1);

        t.setPriority(1);
        t.start();

        hakuna.setPriority(10);
        hakuna.start();

//        int counter = 1;
//        do {
//
//            System.out.println(counter++ + " Thread Main");
//        } while (counter < 100);
    }
}
