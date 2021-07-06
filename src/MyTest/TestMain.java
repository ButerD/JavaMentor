package MyTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestMain {
    static int[] fillArray(int x) {
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

//        Predicate<Integer> predicate = x -> x == 5;
//        System.out.println(predicate.test(4));
//
//        Consumer<Integer> consumer = x -> {
//            for (int i = 0; i < x; i++)
//                System.out.println(i);
//        };
//        consumer.accept(10);
        BufferedReader reader = new BufferedReader(new FileReader(""));

       

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 23, 45, 31, 8, 9, 45));

        List<String> newList = list.stream().filter(x -> x > 30)
                .filter(x -> x <45)

                .sorted(Comparator.reverseOrder())
                .map(x -> String.valueOf(x))
                .collect(Collectors.toList());
        System.out.println(newList);

//        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer * integer2;
//        System.out.println(binaryOperator.apply(2,4));
    }


}
