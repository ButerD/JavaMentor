package MyTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Gener<T>  {

    static <T> void met(T a) {
        System.out.println("Static");
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        met("qw");
        List<ArrayList> arrayLists = new ArrayList<ArrayList>();
       



        List<? super Number> numbers = new ArrayList<>();




        Gen gen = new Gen();
        gen.m(list);

//        t1(list);

    }

    public static void t1(List<Number> list) {
        System.out.println("t1");
    }
    static class Gen<T> {

        void m(Collection<T> collection) {
            System.out.println("Collection 1 -");
            collection.forEach(System.out::println);
        }

         void m(List<Number> list) {
            list.set(1, 2.3);
            System.out.println("List 2 -");
            list.forEach(System.out::println);
        }



    }
}
