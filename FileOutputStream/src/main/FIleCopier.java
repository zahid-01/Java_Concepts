package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleCopier {
    private int chars;

    public void copyContents() {
        try (
                FileReader fileReader = new FileReader("src/main/files/source.txt");
                FileWriter fileWriter = new FileWriter("src/main/files/destination.txt")) {
            int chr;
            do {
                chr = fileReader.read();
                if (chr != -1)
                    fileWriter.append((char) chr);
            } while (chr != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile(){
        try(FileReader fileReader = new FileReader("src/main/files/destination.txt")) {
            int chr;

            do {
                chr = fileReader.read();
                System.out.println((char) chr);
            }while (chr != -1);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


}
