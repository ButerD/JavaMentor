package MyTest;

import java.util.*;
import java.util.function.Consumer;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,5,6,7));

        Collection<?> collection = new ArrayList<>();
        Object o = new Object();




        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {

            if(iterator.next() == 5) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
