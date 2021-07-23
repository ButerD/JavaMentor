package JavaCore.Lection5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class task527 {
    public static void main(String[] args) throws IOException {
        System.out.println(new task527().sumOfStream(Files.newInputStream(Paths.get("1.txt"))));
    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        byte[] buff = inputStream.readAllBytes();
        for(byte b : buff) {
            sum += b;
        }
        return sum;
    }

}
