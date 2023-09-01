package com.sudo.Test5;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    static void divide() throws Exception {
        String path = "/home/zahid-01/Development/Java/AB_JAVA/Exception Handling/src/com/sudo/Test5/abc.txt";
        try (FileInputStream fileInputStream = new FileInputStream(path);
             Scanner scanner = new Scanner(fileInputStream)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println(b/c);
        }
    }

    public static void main(String[] args) throws Exception{
        divide();
    }
}
