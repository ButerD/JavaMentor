package JavaCore.Lection6;

import java.util.Objects;

public class task6112 {
    public static class Pair<T1, T2> {
        T1 valueFirst;
        T2 valueSecond;

        private Pair(T1 value1, T2 value2) {
            this.valueFirst = value1;
            this.valueSecond = value2;
        }

        public static  <T1, T2> Pair <T1, T2> of (T1 v1, T2 v2) {
            return new Pair<>(v1, v2);
        }

        public T1 getFirst() {
            return valueFirst;
        }

        public T2 getSecond() {
            return valueSecond;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(valueFirst, pair.valueFirst) && Objects.equals(valueSecond, pair.valueSecond);
        }

        @Override
        public int hashCode() {
            return Objects.hash(valueFirst, valueSecond);
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println("");
    }
}
