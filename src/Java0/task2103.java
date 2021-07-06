package Java0;

public class task2103 {
    public static void main(String... args) {
        Human human = new Human("Dima", 40);
        human.sayHello();
    }

    public static class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello() {
            System.out.printf("Привет, меня зовут %s, мне %d лет.", name, age);
        }
    }

}


