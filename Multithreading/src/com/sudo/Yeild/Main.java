package com.sudo.Yeild;

class MyThread extends Thread{
    public void run(){
        int counter = 0;
        while(counter<10000){
            System.out.println(counter++ + " MyThread");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        int counter = 0;
        while(counter<10000){
            System.out.println(counter++ + " Main Thread");
            Thread.yield();
        }
    }
}
