package JavaCore.Lection5;

import java.util.Scanner;

public class task5312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            try {
                double parseValue = Double.parseDouble(s);
                result += parseValue;
            } catch (NumberFormatException e) {
            }
        }
        System.out.printf("%.6f", result);


//        String[] values = scanner.nextLine().split(" ");
//        double result = 0;
//
//        for(String s : values) {
//            try {
//                double parseValue = Double.parseDouble(s);
//                result += parseValue;
//            } catch (NumberFormatException e) {
//
//            }
//        }
//
//        System.out.printf("%.6f", result);
    }
}
