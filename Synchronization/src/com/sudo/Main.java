package com.sudo;

class Shared {
    public synchronized void display(String str) {
//        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
//        }
    }
}

class Thread1 extends Thread {
    Shared shared;

    Thread1(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        shared.display("java jdk");
    }
}

class Thread2 extends Thread {
    Shared shared;

    Thread2(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        shared.display("Hello World");
    }
}

public class Main {
    public static void main(String[] args) {
        Shared shared = new Shared();

        new Thread1(shared).start();
        new Thread2(shared).start();
    }
}
