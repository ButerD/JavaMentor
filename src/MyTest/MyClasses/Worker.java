package MyTest.MyClasses;

import java.io.*;

public class Worker extends Person implements Externalizable {
    public String message;
    public final int i = 25;



    public Worker(){

    }

    public Worker(String name, String message) {
        super(name);
        this.message = message;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(message);
        out.writeObject(i);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "message='" + message + '\'' +
                "i='" + i + '\'' +
                "} " + super.toString();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        message = (String) in.readObject();

    }
}
