package com.sudo;

@FunctionalInterface
interface MyLambda{
    public void display();
}

public class Main {
    public static void main(String[] args) {
        MyLambda myLambda = () ->{
            System.out.println("Lambda");
        };

        myLambda.display();
    }
}
