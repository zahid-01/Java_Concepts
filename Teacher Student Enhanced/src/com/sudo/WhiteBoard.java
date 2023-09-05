package com.sudo;

public class WhiteBoard {
    private int studentCount = 0;
    private String line;

    private int count;
    public void attendance() {
        this.studentCount++;
    }

    public synchronized void setLine(String line) {
        if (count!=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        count = studentCount;
        this.line = line;
        notifyAll();
    }

    public synchronized String getLine() {
        if (count==0)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        count--;

        String t = line;

        if (count == 0) {
            notify();
        }
        return t;
    }
}
