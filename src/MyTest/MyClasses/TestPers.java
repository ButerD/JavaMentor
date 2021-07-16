package MyTest.MyClasses;

public class TestPers {
    public static void main(String[] args) {
        Person person = new Person("DD");
        person.setAge(10);

        System.out.println(person.getAge());
        person.setAge(20);

        System.out.println(person.getAge());

    }
}
