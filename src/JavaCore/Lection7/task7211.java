package JavaCore.Lection7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task7211 {
    public static  <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if(list.isEmpty()) {
            minMaxConsumer.accept(null, null);
            return;
        }
        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,3,6,1,8,9,10));
//        BiConsumer<Integer, Integer> consumer =  (i1, i2) ->{ i1.compareTo(i2);
//            System.out.println(i1 + " " + i2);
//        };
        findMinMax(list.stream(), Integer::compareTo, (a, b) -> System.out.println(a + " " + b));

    }
}
