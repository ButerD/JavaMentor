package MyTest.StreamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTEST {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Path.of("1.txt"));
        Stream<String> stream = list.stream();

        List<String> res = stream.filter(s ->
                                                Integer.parseInt(s.split(" ")[1]) > 3000 )
                .peek(System.out::println)
                .sorted(Comparator.reverseOrder())

                .collect(Collectors.toList());

        System.out.println(res);
    }

}
