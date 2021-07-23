package JavaCore.Lection3;

public class task3312 {
public static void main(String[] args) {
    Human firstHuman = new Human();
    Human secondHuman = new Human((byte) 68, "Vladimir", "Putin", "Judo");
    Human thirdHuman = new Human((byte) 55, "Dimka", "Medvedev");
}
public static class Human {
    private byte age;
    private String name;
    private String secondName;
    private String favoriteSport;

    public Human() {
    }

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this.age =  age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {
        this.age =  age;
        this.name = name;
        this.secondName = secondName;
    }
}
}
