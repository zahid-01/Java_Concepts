package com.sudo.Test2;

public class AreaException extends Exception{
    String message;
    public AreaException(String message){
        this.message = message;
    }
    public String toString(){
        return message;
    }
}
