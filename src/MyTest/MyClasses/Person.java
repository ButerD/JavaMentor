package MyTest.MyClasses;

public class Person {
    private String name;
    private int age;
    private Specialty specialty;
    private Sex sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public Sex getSex() {
        return sex;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

     public void setAge(int age) {
        this.age = age;

    }

    public Person(String name, int age, Specialty specialty, Sex sex) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
        this.sex = sex;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialty=" + specialty +
                ", sex=" + sex +
                '}' ;
    }
}
