package MyTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestInterface {

    @FunctionalInterface
    public interface IsSum  {
        public int sum(int a, int b);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4,10);

        list.stream().forEach(i -> System.out.print(i + " "));


        Function<String, Integer> function = Integer::parseInt;

        IsSum sum = (a, b) -> a +b;

        System.out.println(function.apply("2"));
    }
}
