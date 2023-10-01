package dev.sudo;

import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {'a', 'b', 'c', 'd', 'e', 'f', 'j', 'k'};

        //Method 1
        int b;

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        while ((b = byteArrayInputStream.read()) != -1)
            System.out.print((char) b + " ");

        byteArrayInputStream.reset();
        //Method 2 read whole array at once
        String s = new String(byteArrayInputStream.readAllBytes());
        System.out.println("\n" + s);
    }
}
