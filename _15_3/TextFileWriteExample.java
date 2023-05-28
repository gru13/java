package lab.java._15_3;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteExample {
    public static void main(String[] args) {
        String fileName = "file.txt";
        String content = "Hello, World!";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}