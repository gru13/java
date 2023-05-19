import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVFileOperationsExample {
    public static void main(String[] args) {
        String fileName = "data.csv";

        // Write initial data to the CSV file
        writeToFile(fileName, "Name, Age, City");
        appendToFile(fileName, "John, 25, New York");
        appendToFile(fileName, "Jane, 30, London");

        // Read and display the contents of the CSV file
        readAndDisplayFile(fileName);
    }

    public static void writeToFile(String fileName, String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(content);
            System.out.println("Content written to the CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(String fileName, String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(content);
            System.out.println("Content appended to the CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndDisplayFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            StringBuilder fileContent = new StringBuilder();
            int character;

            while ((character = fileReader.read()) != -1) {
                fileContent.append((char) character);
            }

            System.out.println(fileContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
