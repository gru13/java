import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ObjectFileAppendExample {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("grey", 25);

        // Append the object to the file
        appendObjectToFile(person, "objects.dat");

        System.out.println("Object appended to the file.");
    }

    public static void appendObjectToFile(Object obj, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName, true);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
