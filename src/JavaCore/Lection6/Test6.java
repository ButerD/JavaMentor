package JavaCore.Lection6;

import java.util.List;
import java.util.Optional;

public class Test6 {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.of("qqq");

        System.out.println(empty.isEmpty());

        System.out.println(sum("asdas",2));




    }

    public static  <T> T sum(T a, T b){
        T sum = a   ;
        
        return sum ;
    }

}
