import java.util.ArrayList;

public class Tester extends Employee {
    private ArrayList<String> testTypes = new ArrayList<>();

    public Tester(String name, String lastName, String address, String email, String pesel, int hireYear) {
        super(name, lastName, address, email, pesel, hireYear);
    }

    public void addtestType(String s) {
        testTypes.add(s);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = testTypes.size() * 300;
        return baseSalary + bonus;
    }
}
