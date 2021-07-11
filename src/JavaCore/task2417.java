package JavaCore;

public class task2417 {
public static void printOddNumbers(int[] arr) {
    if (arr.length == 0) {
        return;
    }

    StringBuilder str = new StringBuilder("");
    for (int i = 0; i < arr.length; i++) {
        if ((arr[i] % 2) != 0) {
            str.append(arr[i]).append(",");
        }
    }
    if (str.length() > 0) {
        str.replace(str.length() - 1, str.length(), "");
        System.out.println(str);
    }

}

    public static void main(String[] args) {
        printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 100});

    }
}
