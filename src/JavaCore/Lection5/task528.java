package JavaCore.Lection5;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task528 {
    public static void main(String[] args) throws IOException {
        new task528().print(Files.newInputStream(Paths.get("1.txt")), Files.newOutputStream(Paths.get("2.txt")));

    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int b;
        while((b = inputStream.read()) != -1) {
            if(b % 2 == 0) {
                outputStream.write(b);
            }
        }
        outputStream.flush();
    }

}
