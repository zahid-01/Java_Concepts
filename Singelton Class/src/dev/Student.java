package dev;

import java.time.LocalDate;

public class Student {
    private final String name;
    private String rollNumber = "UNIV-";
    private static int studentCount = 1;

    public Student(String name){
        LocalDate localDate = LocalDate.now();
        rollNumber += localDate.getYear() + "-" + studentCount++;
        this.name = name;
    }

    public void printStudentDetails(){
        System.out.println(name + " is assigned the rollNumber " + rollNumber);
    }

}
