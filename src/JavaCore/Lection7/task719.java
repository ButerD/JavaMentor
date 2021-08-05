package JavaCore.Lection7;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class task719 {

    public static void main(String[] args) {

        Predicate<Object> condition = o -> Objects.isNull(o);
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = charSequence -> charSequence.length();
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        String s = "null";

        System.out.println(condition.test(s));

    }

    public static <T, U> Function<T, U> ternaryOperator(Predicate<? super T> condition, Function<? super T, ? extends U> ifTrue, Function<? super T, ? extends U> ifFalse) {

        return  t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t) ;

    }
}
