package main;

import java.io.*;

public class FIleCopier {
    private int chars;

    public void copyContents() {
        try (
                FileReader fileReader = new FileReader("src/main/files/source.txt");
                FileWriter fileWriter = new FileWriter("src/main/files/destination.txt")) {
            int chr;
            do {
                chr = fileReader.read();
                if (chr >= 65 && chr <= 90)
                    fileWriter.append((char) (97 + chr - 65));
                else if(chr != -1)
                    fileWriter.append((char) chr);
            } while (chr != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile() {
        try (FileReader fileReader = new FileReader("src/main/files/destination.txt")) {
            int chr;

            do {
                chr = fileReader.read();
                System.out.println((char) chr);
            } while (chr != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void comboCopier(){
        try(
        FileInputStream fileInputStream1 = new FileInputStream("src/main/files/source.txt");
        FileInputStream fileInputStream2 = new FileInputStream("src/main/files/destination.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/files/comboDest.txt");
        ){
            SequenceInputStream stream = new SequenceInputStream(fileInputStream1, fileInputStream2);

            int character;
            while ((character = stream.read()) != -1)
                fileOutputStream.write(character);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
