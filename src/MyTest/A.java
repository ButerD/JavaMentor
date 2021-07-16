package MyTest;

public class A {

    static void pr(String... s) {
        System.out.println("a");


    }

    public static void main(String[] args) {
        pr();
    }
}

 class B extends A {


    final void pr(String s) {
        System.out.println("a" + s + "!!!!!!!!!!!!");
    }

}

class c extends B {



}