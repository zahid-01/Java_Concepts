package com.sudo;

import com.sudo.Old_NEW.OldNew;

@interface MyAnno{

}
class Parent{
    public void display(){
        System.out.println("Hi");
    }
}

class Child extends Parent{
     @Override
    public void display(){
         int x;
     }
}

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        OldNew oldNew = new OldNew();
        oldNew.jolt();
    }
}
