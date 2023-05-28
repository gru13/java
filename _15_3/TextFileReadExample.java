package lab.java._15_3;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReadExample {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}