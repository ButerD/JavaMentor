package MyTest.SerializeTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMain {
    public static void main(String[] args) {
        Second second = new Second();

        second.setfNum(1);
        second.setF1("First");
        second.setsNum(2);
        second.setS2("Second");

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
            ous.writeObject(second);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
