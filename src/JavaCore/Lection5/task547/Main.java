package JavaCore.Lection5.task547;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream("animal.data");
        byte[] data = is.readAllBytes();

        for (Animal animal : deserializeAnimalArray(data)) {
            System.out.println(animal);
        }
    }

public static Animal[] deserializeAnimalArray(byte[] data) {
    DataInputStream bis = new DataInputStream(new ByteArrayInputStream(data));
    Animal[] animal;
    try (ObjectInputStream ois = new ObjectInputStream(bis)) {
        int size = ois.readInt();
        animal = new Animal[size];
        for (int i = 0; i < size; i++) {
            animal[i] = (Animal) ois.readObject();
        }
    } catch (RuntimeException | ClassNotFoundException | IOException e) {
        throw new IllegalArgumentException(e);
    }
    return animal;
}


}
