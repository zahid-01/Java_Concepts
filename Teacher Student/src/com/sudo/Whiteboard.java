package com.sudo;

public class Whiteboard {
    private String line;
    private boolean flag = true;

    public synchronized void setLine(String line) {
        if (!flag) {
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        this.line = line;
        notify();
        flag = false;
    }

    public synchronized String getLine(){
        if (flag) {
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        flag = true;
        notify();
        return line;
    }

}
