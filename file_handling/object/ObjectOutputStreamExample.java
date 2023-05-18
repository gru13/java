import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.dat"))) {
            Person person1 = new Person("John", 25);
            Person person2 = new Person("Jane", 30);

            oos.writeObject(person1);
            oos.writeObject(person2);

            System.out.println("Objects written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
