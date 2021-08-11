package JavaCore.Lection6;

import java.util.ArrayList;
import java.util.Arrays;

public class task6113 {
    public static class DynamicArray<T> {
        private Object[] elements;

        private int realSize;

        public DynamicArray() {
            realSize = 0;
            elements = (T[]) (new Object[5]);
        }

        public void add(T el) {
            if (realSize == (elements.length - 1)) {
                Object[]  tmpArray;
                tmpArray = Arrays.copyOf(elements, elements.length * 2);
                elements = tmpArray;
            }
            elements[realSize] = el;
            realSize++;
        }

        public T get(int index) {
            if (index >= realSize || index < 0) {
                return null;
            }
            return (T) elements[index];
        }

        public void remove(int index) {
            if (index >= realSize) {
                return;
            }
            System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
            realSize--;
        }
    }

    public static void main(String[] args) {
        DynamicArray<Integer> da = new DynamicArray<>();


        da.add(0);

        da.add(1);

        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);

        da.add(0);
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);


        System.out.println();
    }

}
