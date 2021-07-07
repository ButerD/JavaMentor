package MyTest;

import MyTest.MyClasses.Person;
import MyTest.MyClasses.Specialty;
import MyTest.MyClasses.StreamPersonUtil;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;
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
        Scanner scanner1 = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        String s = scanner1.nextLine();

        System.out.println(s);

        List<Person> list = StreamPersonUtil.getPersonList();
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        }


        Map<Specialty, List<Person>> newPerson = list.stream()
                .collect(Collectors.groupingBy(person -> person.getSpecialty()));
        System.out.println(newPerson);


//        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer * integer2;
//        System.out.println(binaryOperator.apply(2,4));
    }


}
