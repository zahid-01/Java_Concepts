package com.sudo;

public class Teacher extends Thread {
    WhiteBoard whiteBoard;

    String[] lines = new String[]{"Java is a language,", "Its OOPS", "It supports multithreading", "end"};

    public Teacher(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        for (String str : lines) {
            System.out.println("Teacher --> " + str);
            whiteBoard.setLine(str);
        }
    }
}
