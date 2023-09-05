package com.sudo;

public class Main {
    public static void main(String[] args) {
        WhiteBoard whiteBoard = new WhiteBoard();

       Student s1 = new Student(whiteBoard,"dave");
       Student s2 = new Student(whiteBoard,"Bilal");
       Student s3 = new Student(whiteBoard,"Watson");
       Student s4 = new Student(whiteBoard,"Xenon");

        new Teacher(whiteBoard).start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
