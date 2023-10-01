package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FIleCopier fIleCopier = new FIleCopier();
        fIleCopier.copyContents();
        fIleCopier.comboCopier();

        //Writing to the file
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("src/main/text1.txt");) {
//            String s = "Welcome to java IO";
//            fileOutputStream.write(s.getBytes());

//            byte[] s = "Habibi come to Dubai!".getBytes();
//            for (byte b : s) {
//                fileOutputStream.write(b);
//            }

            byte[] s = "niagra Falls".getBytes();
            fileOutputStream.write(s, 4, s.length - 4);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Reading from the file

        try(FileReader f = new FileReader("src/main/text1.txt");){
//            byte[] bytes = new byte[f.available()];
//            f.read(bytes);
//            String s = new String(bytes);
//            System.out.println(s);

            int b;

            do {
                b = f.read();
                System.out.print((char)b);
            }while (b != -1);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
