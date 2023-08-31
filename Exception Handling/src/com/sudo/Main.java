package com.sudo;

public class Main {
    public static void main(String[] args){
        try{
            throw new MinBalanceException();
        }catch (MinBalanceException e){
            System.out.println(e.getMessage());
        }
//        int x = 5;
//        try {
//            for (int i = 0; i < 10; i++)
//                System.out.println(12 /0);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }catch (Exception e) {
//            System.out.println(e);
//        }

    }
}
