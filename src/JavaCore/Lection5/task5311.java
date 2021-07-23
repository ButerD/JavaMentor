package JavaCore.Lection5;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class task5311 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] bytes = inputStream.readAllBytes();

        return new String(bytes, charset);
    }
}
