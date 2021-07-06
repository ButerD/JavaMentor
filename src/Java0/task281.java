package Java0;

public class task281 {
    public static int getMinFromTwo(int x, int y) {
        return (x < y) ? x : y;
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
        int min1 = getMinFromTwo(x, y);
        int min2 = getMinFromTwo(m, n);

        return  (min1 < min2) ? min1 : min2;
    }



    public static void main(String[] args) {
        System.out.println(getMinFromFour(1,2,3,5));
    }
}
