package MyTest;

public class TestInterface {

    @FunctionalInterface
    public interface IsSum  {
        public int sum(int a, int b);
    }

    public static void main(String[] args) {
        IsSum sum = (a, b) -> a +b;

        System.out.println(sum.sum(1,2));
    }
}
