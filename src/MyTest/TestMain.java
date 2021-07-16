package MyTest;


import java.util.Arrays;

import static java.lang.System.out;

public class TestMain {
    public static final int i = 10;


    public static void main(String[] args) {
        Object i = Integer.valueOf(42);
        try {
            out.println(5 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        IllegalStateException
        out.println("11111");

    }


    public static void s(Integer[] a) {
        a[0] = 10;

    }



}




