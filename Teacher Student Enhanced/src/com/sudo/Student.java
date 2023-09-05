package com.sudo;

public class Student extends Thread{
    WhiteBoard whiteBoard;
    String name;

    public Student(WhiteBoard whiteBoard, String name){
        this.whiteBoard = whiteBoard;
        this.name = name;
        whiteBoard.attendance();
    }

    @Override
    public void run() {
        String line;

        do{
            line = whiteBoard.getLine();
            System.out.print(name + " is reading -> ");
            System.out.println(line);
            System.out.flush();
        }while (!line.equals("end"));
    }
}
