import java.util.ArrayList;

public class Developer extends Employee {
    private ArrayList<Technology> technologies = new ArrayList<>();

    public Developer(String name, String lastName, String address, String email, String pesel, int hireYear) {
        super(name, lastName, address, email, pesel, hireYear);
    }

    public void addTechnology(Technology t) {
        technologies.add(t);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology t : technologies) {
            bonus += t.getBonus();
        }
        return baseSalary + bonus;
    }
}
