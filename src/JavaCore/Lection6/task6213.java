package JavaCore.Lection6;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class task6213 {
    public static void main(String[] args) {
        Set<Integer> s1 = new LinkedHashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new LinkedHashSet<>(Arrays.asList(0,1,2));






//
//        s1.forEach(v -> {if(!s2.contains(v))
//                        System.out.println(v + " ");});
//        s2.forEach(v -> {if(!s1.contains(v))
//            System.out.println(v + " ");});

        System.out.println(symmetricDifference(s1, s2));
    }


    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new LinkedHashSet<>();
        for (T t : set1) {
            if(!set2.contains(t)) {
                result.add(t);
            }
        }
        for (T t : set2) {
            if(!set1.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
