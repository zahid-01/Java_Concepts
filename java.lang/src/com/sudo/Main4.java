package com.sudo;

import java.lang.reflect.Method;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

public class Main4 {
    public static void main(String[] args) {
        Class c = My.class;
        Method[] m = c.getMethods();

        for (Method mx:m)
            System.out.println(mx);
    }
}
