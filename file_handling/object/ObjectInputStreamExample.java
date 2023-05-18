import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.dat"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Person) {
                        Person person = (Person) obj;
                        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}