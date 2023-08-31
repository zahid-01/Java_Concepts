package com.sudo;

public class MinBalanceException extends Exception{
    public String toString(){
        return "Minim balance reached";
    }

    public String getMessage(){
        return "Minimum  balance cannot be less than 5000";
    }
}
