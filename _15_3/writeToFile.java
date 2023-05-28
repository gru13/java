package lab.java._15_3;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class writeToFile {
    public static void main(String[] args) {
        String FileName = "File.txt";
        File FILE = new File(FileName);
        try (FileReader file = new FileReader(FILE)) {
            StringBuilder Res = new StringBuilder();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
