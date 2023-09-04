package com.sudo.Runnable.ThreadClass;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        for (int i = 0; i < 110; i++) {
            System.out.println(i + " MyThread");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
//        setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        for (int i = 0; i < 110; i++) {
            System.out.println(i + " MyThread 1");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new MyThread1("My Thread 1").start();
        new MyThread("My Thread").start();
    }
}
