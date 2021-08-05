package JavaCore.Lection6;

public class task6111 {

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<T>();
        }
    }

}


