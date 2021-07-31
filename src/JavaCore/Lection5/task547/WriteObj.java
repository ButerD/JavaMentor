package JavaCore.Lection5.task547;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) throws IOException {
        Animal animal = new Animal("Cat1");
        int size = -1;
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("animal.data"));

        ous.writeInt(size);
        ous.writeObject(animal);

    }
}
