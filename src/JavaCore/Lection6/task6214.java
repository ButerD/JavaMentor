package JavaCore.Lection6;

import java.util.*;

public class task6214 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String> list = new ArrayList<>();
        String[] s = line.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(i % 2 != 0) {
                list.add(s[i]);
            }
        }
        Collections.reverse(list);
        list.forEach(v -> System.out.print(v + " "));
    }


}
