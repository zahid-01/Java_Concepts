package com.sudo.Test3;

public class Main {
    public static void main(String[] args) {
        meth1();
    }

    static void meth1(){
        System.out.println(meth2());
    }

    static int meth2(){
        try {
            return 5/0;
        }finally {
            System.out.println("Reached end!");
        }

//        return 3;
    }
}
