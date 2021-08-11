package MyTest;

import java.util.*;

public class func {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Gen<?> gen = new Gen();
        gen.m(integerList);

        List<ArrayList> arrayLists = new ArrayList<ArrayList>();

    }

    static class Gen<E> {
        <T> void m(Collection<T> collection) {
            System.out.println("Collect");
            for (T s : collection) {
                System.out.println(s);
            }
        }

        <T> void m(List<String> list) {
            System.out.println("List");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
