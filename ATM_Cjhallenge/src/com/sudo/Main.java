package com.sudo;

import com.sudo.ATM.AtmMachine;
import com.sudo.ATM_Users.User1;

public class Main {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();
         new User1(atmMachine, "zahid", 222).start();
         new User1(atmMachine, "qurat", 333).start();
         new User1(atmMachine, "hadi", 444).start();
    }
}
