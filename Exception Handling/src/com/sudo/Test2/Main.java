package com.sudo.Test2;

public class Main {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        try {
            int area = meth2(5, 1);
            System.out.println(area);
        } catch (AreaException e) {
            System.out.println(e);
        }
    }

    public static int meth2(int a, int b) throws AreaException{
        if (a < 1 || b < 1)
            throw new AreaException("Provide positive magnitudes only");
        return a * b;
    }
}
