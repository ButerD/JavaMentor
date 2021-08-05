package MyTest;


    public class TestClass<T> {

        private T value1;
        private T value2;

        public void printValues() {
            System.out.println(value1);
            System.out.println(value2);
        }

        public static <X> TestClass <X> createAndAdd2Values(Object o1, Object o2) {
            TestClass<X> result = new TestClass<>();
            result.value1 = (X) o1;
            result.value2 = (X) o2;
            return result;
        }

        public static void main(String[] args) {
            Double d = 22.111;
            String s = "Test String";
            TestClass<Integer> test = createAndAdd2Values(d, s);
            test.printValues();
        }
    }

