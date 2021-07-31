package MyTest.SerializeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadMain {
    public static void main(String[] args) {
        Second second;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {

            second = (Second) ois.readObject();

            System.out.println(second);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
