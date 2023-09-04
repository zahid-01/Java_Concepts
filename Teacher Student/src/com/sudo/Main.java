package com.sudo;

public class Main {
    public static void main(String[] args) {
        Whiteboard whiteboard = new Whiteboard();

        new Teacher(whiteboard).start();
        new Student(whiteboard).start();
    }
}
