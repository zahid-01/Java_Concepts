package com.sudo;

enum Dept{
    CS, ECE, CIVIL, EE;

    private Dept(){
        System.out.println(this.name());
    }
    public void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }
}
public class Main3 {
    public static void main(String[] args) {
        Dept cs = Dept.CS;
        cs.display();
    }
}
