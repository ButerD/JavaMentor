package JavaCore.Lection7.FinalTask7213;

public class Salary implements Sendable<Integer> {
    private final String companyName;
    private final String name;
    private final Integer salary;



    public Salary(String companyName, String name, Integer salary) {
        this.companyName = companyName;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return companyName;
    }

    @Override
    public String getTo() {
        return name;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}
