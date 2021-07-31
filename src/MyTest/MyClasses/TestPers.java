package MyTest.MyClasses;

import java.io.*;

public class TestPers {
    public static void main(String[] args) {


        Worker worker = new Worker("Worker", "heei");
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("data.bin"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            ous.writeObject(worker);

            Worker newWorker = (Worker) ois.readObject();


            System.out.println(newWorker);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(worker);
    }
}
