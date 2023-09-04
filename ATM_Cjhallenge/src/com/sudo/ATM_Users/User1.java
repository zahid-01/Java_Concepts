package com.sudo.ATM_Users;

import com.sudo.ATM.AtmMachine;

public class User1 extends Thread{
    private final AtmMachine ATM;
    private final String name;
    private final int amount;

    public User1(AtmMachine ATM, String name, int amount) {
        this.ATM = ATM;
        this.name = name;
        this.amount = amount;
    }

    public void run(){
//        ATM.useAtm(name, amount);
        ATM.displayBalance(name,amount);
        ATM.withdraw(name, amount);
    }
}


