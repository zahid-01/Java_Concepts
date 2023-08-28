package dev.sudo;

import dev.StaticBlock;

public class Main {
    static {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("!!!!!");
    }

    public static void main(String[] args) {
        System.out.println("MAIN");
    }

    static {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("!!!!!");
    }
}

class Test{
    static {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("!!!!!");
    }
}
