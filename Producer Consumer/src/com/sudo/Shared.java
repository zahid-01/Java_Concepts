package com.sudo;

public class Shared {
    public int value = 0;
    private boolean flag = true;

    public synchronized void set(int value) {
        while (!flag) {
           try {
               wait();
           }catch (InterruptedException e){
               System.out.println(e.getMessage());
           }
        }
        this.value = value;
        flag = false;
        notify();
    }

    public synchronized int get() {
        int x;
        while(flag){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}
