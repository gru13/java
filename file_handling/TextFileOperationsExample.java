import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileOperationsExample {
    public static void main(String[] args) {
        String fileName = "file.txt";

        // Write content to the file
        writeToFile(fileName, "Hello, World!");

        // Append content to the file
        appendToFile(fileName, " This is additional text.");

        // Read and display the content of the file
        readAndDisplayFile(fileName);
    }

    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(content);
            System.out.println("Content appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();wsx 
        }
    }

    public static void readAndDisplayFile(String fileName) {
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

/*

To perform text file operations in Java, you need to import the necessary classes from the `java.io` package. The two main classes used are `FileReader` and `FileWriter`.

1. FileReader: This class is used to read data from a file. It reads the file character by character or in chunks, depending on how it's used.

2. FileWriter: This class is used to write data to a file. It allows you to write characters or strings to a file.

To write content to a file:
- Create an instance of `FileWriter` with the file name as the parameter.
- Use the `write` method to write the content to the file.
- Close the `FileWriter` to ensure proper resource management.

To append content to a file:
- Create an instance of `FileWriter` with the file name and `true` as parameters. The `true` parameter indicates that the file is opened in append mode.
- Use the `write` method to append the content to the file.
- Close the `FileWriter` to ensure proper resource management.

To read content from a file:
- Create an instance of `FileReader` with the file name as the parameter.
- Use the `read` method to read the content character by character or in chunks.
- Process the content as desired (e.g., display on the console).
- Close the `FileReader` to ensure proper resource management.

It's important to handle exceptions properly when working with file operations in Java. In the provided code, exceptions are caught using try-catch blocks, and the `printStackTrace` method is called to display any errors that occur.

Remember to close the file readers and writers after use to release system resources.

I hope this provides a good understanding of the theory behind text file operations in Java. If you have any more specific questions, feel free to ask!

Writing Content to a File:
1. Use `FileWriter` to write data to a file.
2. Create an instance of `FileWriter` with the file name as the parameter.
3. Use the `write` method to write the content to the file.
4. Close the `FileWriter` to ensure proper resource management.

Appending Content to a File:
1. Use `FileWriter` with the `true` parameter to open the file in append mode.
2. Create an instance of `FileWriter` with the file name and `true` as parameters.
3. Use the `write` method to append the content to the file.
4. Close the `FileWriter` to ensure proper resource management.

Reading Content from a File:
1. Use `FileReader` to read data from a file.
2. Create an instance of `FileReader` with the file name as the parameter.
3. Use the `read` method to read the content character by character or in chunks.
4. Process the content as desired (e.g., display on the console).
5. Close the `FileReader` to ensure proper resource management.

Exception Handling:
1. Handle `IOException` properly when working with file operations.
2. Use try-catch blocks to catch exceptions.
3. Call the `printStackTrace` method to display any errors that occur.

Resource Management:
1. Close the file readers and writers after use to release system resources.
2. Closing resources can be done using the try-with-resources statement to ensure automatic resource closure.

By following these points, you can effectively perform text file operations in Java.

If you have any further questions or need clarification on any point, feel free to ask!
 */