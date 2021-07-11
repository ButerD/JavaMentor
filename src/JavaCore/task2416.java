package JavaCore;

import java.util.Arrays;

public class task2416 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenArray(9)));
    }

public static int[] evenArray(int number) {
    if (number % 2 != 0) {
        number--;
    }
    int[] arr = new int[number / 2];
    int value = 2;
    for (int i = 0; i < number / 2; i++) {
        arr[i] = value;
        value += 2;
    }
    return arr;
}


}
