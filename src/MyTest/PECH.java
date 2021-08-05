//package MyTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Class1 {
//}
//
//class Class2 extends Class1 {
//}
//
//class Class3 extends Class2 {
//}
//
//
//public class PECS {
//    public static void main(String[] args) {
//        List<Class1> list1 = new ArrayList<>();
//        List<Class2> list2 = new ArrayList<>();
//        List<Class3> list3 = new ArrayList<>();
//
//        objGet(list1);
//        objGet(list2);
//        objGet(list3);
//
//        objAdd(list1);
//        objAdd(list2);
//        objAdd(list3);
//    }
//
//    public static void objGet(List<? extends Class2> list) {
//        Class1 obj1 = list.get(0);
//        Class2 obj2 = list.get(0);
//        Class3 obj3 = list.get(0);
//    }
//
//    public static void objAdd(List<? super Class2> list) {
//        list.add(new Class1());
//        list.add(new Class2());
//        list.add(new Class3());
//    }
//}
