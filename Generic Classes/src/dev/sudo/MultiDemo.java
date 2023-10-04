package dev.sudo;

public class MultiDemo<T,U> {
    T ts;
    U us;

    public void setParams(T x, U y){
        ts = x;
        us = y;

        System.out.println(ts);
        System.out.println(us);
    }
}
