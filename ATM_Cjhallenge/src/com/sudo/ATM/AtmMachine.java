package com.sudo.ATM;

public class AtmMachine {

//    public synchronized void useAtm(String name, int amount){
//        displayBalance(name, amount);
//        withdraw(name, amount);
//    }

    public synchronized void displayBalance(String name, int balance){
        System.out.println(name + " checking balance :");
        try {
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(balance);
    }

    public synchronized void withdraw(String name, int amount){
        System.out.println(name + " is withdrawing: ");
        try {
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(amount);
    }
}
