package com.sudo;

public class Teacher extends Thread {
    Whiteboard whiteboard;

    String[] lines = new String[]{"Java is a language,", "Its OOPS", "It supports multithreading", "end"};

    public Teacher(Whiteboard whiteboard) {
        this.whiteboard = whiteboard;
    }

    public void run() {
        for (String str : lines) {
            System.out.println("Teacher: " + str);
            whiteboard.setLine(str);
        }
    }
}
