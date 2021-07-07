package MyTest.MyClasses;

import java.util.List;

public class StreamPersonUtil {
    public static List<Person> getPersonList() {
        return List.of(
                new Person("Dima", 40, Specialty.DEVOPS, Sex.MALE),
                new Person("Ira", 20, Specialty.DEVOPS, Sex.FEMALE),
                new Person("Igor", 50, Specialty.ENGINEER, Sex.MALE),
                new Person("Oleg", 25, Specialty.MANAGER, Sex.MALE),
                new Person("Sveta", 33, Specialty.MANAGER, Sex.FEMALE)
        );
    }
}
