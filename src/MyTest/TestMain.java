package MyTest;


import MyTest.MyClasses.Worker;

import javax.swing.tree.TreeNode;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.*;


public class TestMain {
    public static void method(List<? super Integer> list) {
        System.out.println("Method 1");
        list.add(12);

        list.forEach(System.out::println);

    }

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6));
        new ArrayList<Integer>();
        method(list);

        System.out.println(list);

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




