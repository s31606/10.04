import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Goal> goals = new ArrayList<>();

    public Manager(String name, String lastName, String address, String email, String pesel, int hireYear) {
        super(name, lastName, address, email, pesel, hireYear);
    }

    public void addGoals(Goal g) {
        goals.add(g);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        LocalDate currentDate = LocalDate.now();

        for (Goal goal : goals) {
            if (goal.getYear() == currentDate.getYear() && goal.getMonth () == currentDate.getMonthValue()) {
                bonus += goal.getBonus();
            }
        }

        return baseSalary + bonus;
    }
}
