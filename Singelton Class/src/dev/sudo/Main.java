package dev.sudo;

import dev.Singelton;
import dev.Student;

public class Main {
    public static void main(String[] args) {
        Singelton obj1 = Singelton.getInstance();
        Singelton obj2 = Singelton.getInstance();
        Singelton obj3 = Singelton.getInstance();
        obj1.makeCoffee();

        java.lang.String str = new java.lang.String("Zahid");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        Student zahid = new Student("Zahid Hussain Khan");

        zahid.printStudentDetails();

//        Singelton sobj = new Singelton();  "Will not work."
    }
}
