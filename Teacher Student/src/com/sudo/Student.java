package com.sudo;

public class Student extends Thread{
    Whiteboard whiteboard;

    public Student(Whiteboard whiteboard){
        this.whiteboard = whiteboard;
    }
    public void run(){
        String line = "dummy";
        while (!line.equalsIgnoreCase("end")){
           line = whiteboard.getLine();
            System.out.println("Student: " + line);
        }
    }
}
