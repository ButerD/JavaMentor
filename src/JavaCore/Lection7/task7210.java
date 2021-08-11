package JavaCore.Lection7;

import java.util.List;
import java.util.stream.IntStream;

public class task7210 {
    public static void main(String[] args) {
//        int n = 384;
//        System.out.println( ( n * n * 0.1) % 1000);

        IntStream intStream = IntStream.iterate(16, n -> ((int)(n * n * 0.1)) % 1000);

        intStream.limit(10).forEach(System.out::println);

    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((int)(n * n * 0.1)) % 1000);
    }
}
