package com.sudo.Daemon;

class MyThread extends Thread{
    public void run(){
        int count = 0;

        while (count<1000){
            System.out.println(count++);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();

        Thread mainThread = Thread.currentThread();
        try{
            mainThread.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}
