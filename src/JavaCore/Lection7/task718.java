package JavaCore.Lection7;

public class task718 {
    public static void main(String[] args) {
//        NumberGenerator<Integer> ng = arg -> arg.intValue()  > 0;

        System.out.println(getGenerator().cond(-1));
    }

    public static NumberGenerator<? super Number> getGenerator() {

        return arg -> arg.intValue() > 0;
    }
}

interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
