package JavaCore.Lection3;

public class task3311 {

public static class Cat {

    public void sayHello() {
        System.out.println("Мяу!");
    }
}

public static class Dog {

    public void sayHello() {
        System.out.println("Гав!");
    }

    public void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        sayHello();
        cat.sayHello();
    }
}

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sayHello();
        dog.sayHello();
        dog.catchCat(cat);

    }
}


