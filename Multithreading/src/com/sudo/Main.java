package com.sudo;

class MyThread extends Thread {
    public void run() {
        int counter = 1;

        while (true) {
            System.out.println(counter++ + " Hello");
            if (counter == 100) break;
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread" + i);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        MyThread1 t1 = new MyThread1();
        t1.start();

        int counter = 1;

        while (true) {
            System.out.println(counter++ + " World");
            if (counter == 100) break;
        }
    }
}
