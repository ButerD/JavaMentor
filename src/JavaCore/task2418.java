package JavaCore;

import java.util.Arrays;

public class task2418 {
public static int[] mergeArrays(int[] a1, int[] a2) {
    int[] a3 = new int[a1.length + a2.length];
    int i = 0;
    int j = 0;
    for (int k = 0; k < a3.length; k++) {

        if (i >= a1.length) {
            a3[k] = a2[j];
            j++;
            continue;
        }
        if (j >= a2.length) {
            a3[k] = a1[i];
            i++;
            continue;
        }
        if (a1[i] <= a2[j]) {
            a3[k] = a1[i];
            i++;
            continue;
        }
        if (a2[j] < a1[i]) {
            a3[k] = a2[j];
            j++;
            continue;
        }
    }
    return a3;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 1, 1}, new int[]{1, 1, 1})));
    }
}
