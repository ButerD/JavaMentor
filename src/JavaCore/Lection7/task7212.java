package JavaCore.Lection7;

import java.io.BufferedReader;
import java.io.IOException;
//import java.nio.charset.StandardCharsets;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task7212 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, java.nio.charset.StandardCharsets.UTF_8));

        reader.lines()
                .flatMap(s -> Stream.of(s.split( "[^A-Za-zА-Яа-я0-9]+")))
                .map(s -> s.toLowerCase())
                .collect(Collectors.toMap(k -> k, v -> 1, (vOld, vNew) -> vOld + vNew ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())

                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

//        Map<String, Integer> map = new TreeMap<>();
//
//        reader.lines()
//                .flatMap(line -> Stream.of(line.split("[^A-Za-zА-Яа-я0-9]+")))
//                .map(String::toLowerCase)
//                .forEach(s -> map.merge(s, 1, Integer::sum));
//
//        map.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .limit(10)
//                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
