package com.sudo.Test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static FileInputStream fileInputStream;
    static Scanner scanner;

    static void divide() throws Exception {
        fileInputStream = new FileInputStream("/home/zahid-01/Development/Java/AB_JAVA/Exception Handling/src/com/sudo/Test4/abc.txt");
        scanner = new Scanner(fileInputStream);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(b / c);

        fileInputStream.close();
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        try {

            divide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
    }
}
