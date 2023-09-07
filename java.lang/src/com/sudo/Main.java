package com.sudo;


public class Main {
    public static void main(String[] args) {
//       Integer i = new Integer(10); Deprecated
//        Integer i = Integer.valueOf(10); Unnecessary boxing
        Integer i = 10;

//        Byte b = Byte.valueOf("12");
//        System.out.println(b);

        int m1 = 10;
        Integer m2 = m1;

//        System.out.println(m2.equals(Integer.valueOf(m1)));
        Integer x = Integer.valueOf("1011",2);
        System.out.println(Integer.valueOf("F22",16));
        System.out.println(Integer.decode("0x22"));
        System.out.println(Integer.parseInt("1234"));
        System.out.println(Integer.reverseBytes(128));

//        int z = 213/0;

        System.out.println(Float.isNaN(213f));
    }
}
