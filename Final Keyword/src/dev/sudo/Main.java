package dev.sudo;

import dev.dev.Child;

public class Main {
    final int PI;

    public Main(){
        PI = 3;
    }
    public static void main(String[] args) {
        new Child().meth();
        System.out.println(Math.PI);
    }
}
