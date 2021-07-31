package JavaCore.Lection5;

import java.io.*;
import java.nio.charset.Charset;

public class task5311 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader isr = new InputStreamReader(inputStream, charset);

        StringWriter sw = new StringWriter();
        int b;
        while((b = isr.read()) != -1) {
            sw.write(b);
        }
        return sw.toString();
    }
}
