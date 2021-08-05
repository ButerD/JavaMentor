package JavaCore.Lection6;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class task6215 {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("1.txt");

        System.out.println(getSalesMap(reader));

    }

//    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
//        Map<String, Long> map = new TreeMap<>();
//        BufferedReader bReader = new BufferedReader(reader);
//        String line = null;
//        while ((line = bReader.readLine()) != null) {
//            String[] parseLine = line.split(" ");
//            if (map.containsKey(parseLine[0])) {
//                map.put(parseLine[0], map.get(parseLine[0]) + Long.valueOf(parseLine[1]));
//            } else {
//                map.put(parseLine[0], Long.valueOf(parseLine[1]));
//            }
//        }
//
//
//        return map;
//    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new TreeMap<>();
        Scanner scanner = new Scanner(reader);
        String line = null;
        while (scanner.hasNext()) {
            String name = scanner.next();
            Long sale = scanner.nextLong();
            map.merge(name, sale, Long::sum);
        }
        return map;
    }

}
