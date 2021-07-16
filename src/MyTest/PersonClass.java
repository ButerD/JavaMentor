package MyTest;

import MyTest.MyClasses.Person;
import MyTest.MyClasses.Sex;
import MyTest.MyClasses.Specialty;

public class PersonClass {
    public static void main(String[] args) {
        Person person = new Person("Dima", 40, Specialty.DEVOPS, Sex.MALE);

        System.out.println(person.getSpecialty().getTranslate());
    }
}
