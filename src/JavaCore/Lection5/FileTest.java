package JavaCore.Lection5;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\");
        Path path = file.toPath();

        InputStream is = Files.newInputStream(Paths.get("1.txt"));

        byte[] buff = is.readAllBytes();

        System.out.println(new String(buff));

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
