package JavaCore.Lection5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\");
        Path path = file.toPath();

        OutputStream outputStream = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);

        writer.write(500);
        writer.flush();
        System.out.println();

//        InputStream is = Files.newInputStream(Paths.get("1.txt"));
//
//        byte[] buff = is.readAllBytes();
//
//        System.out.println(new String(buff));


//        SimpleFileVisitor sfv = new SimpleFileVisitor() {
//            @Override
//            public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
//                return FileVisitResult.CONTINUE;
//            }
//
//            @Override
//            public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
//                System.out.println(file);
//                return FileVisitResult.CONTINUE;
//            }
//        };
//        Files.walkFileTree(path, sfv);
//        printDir(file);


    }

    public static void printDir(File file) {
            if (file.listFiles() != null) {
                for (File f : file.listFiles()) {
                    if (f.isDirectory()) {
                        printDir(f);
                    } else if (f.isFile()) {
                        System.out.println(f);
                    }
                }
            }
    }
}
