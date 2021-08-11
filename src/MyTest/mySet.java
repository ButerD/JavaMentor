package MyTest;

import java.util.*;

public class mySet {
    public static void main(String[] args) {



        Set<Integer> set = new LinkedHashSet<>();
        set.add(7);
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(8);
        System.out.println(set.add(77));
        System.out.println(set.contains(7));
        set.remove(1);

        set.add(0);

        System.out.println(set);
    }
}

