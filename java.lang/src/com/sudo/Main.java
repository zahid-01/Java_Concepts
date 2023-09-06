package com.sudo;

public class Main {
    public static void main(String[] args) {
//       Integer i = new Integer(10); Deprecated
//        Integer i = Integer.valueOf(10); Unnecessary boxing
        Integer i = 10;

        Byte b = Byte.valueOf("12");
        System.out.println(b);
    }
}
