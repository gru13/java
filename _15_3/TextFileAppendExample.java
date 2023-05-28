package lab.java._15_3;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileAppendExample {
    public static void main(String[] args) {
        String fileName = "file.txt";
        String content = " This is additional text.";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(content);
            System.out.println("Content appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}