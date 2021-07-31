package MyTest;


import MyTest.MyClasses.Worker;

import javax.swing.tree.TreeNode;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Arrays;


public class TestMain {
    public static final int i = 10;


    public static void main(String[] args) throws IOException {


        Worker worker = new Worker("Worker", "message");
        InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
//        is = System.in;

        is.read();
    }
}




