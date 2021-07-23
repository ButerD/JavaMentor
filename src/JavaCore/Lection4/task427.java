package JavaCore.Lection4;

public class task427 {
public static class Car implements AutoCloseable{
    public void drive() {
        System.out.println("Машина поехала.");
    }

    @Override
    public void close()  {
        System.out.println("Машина закрывается...");
    }
}

public static void main(String[] args)  {
    try(Car car = new Car()) {
        car.drive();
    } catch (RuntimeException e) {
        //.......
    }
}
}
