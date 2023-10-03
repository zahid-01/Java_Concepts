package dev.sudo;

public class Demo<T>{
    private T t;

    public void setT(T t){
        this.t = t;
    }

    public void getT(){
        System.out.println(t);
    }
}
