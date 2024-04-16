import java.time.Year;

public class Employee {
    protected String name;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel;
    protected int hireYear;

    public Employee(String name, String lastName, String address, String email, String pesel, int hireYear) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.hireYear = hireYear;
    }

    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsWorked = Year.now().getValue() - hireYear;
        int salary = baseSalary + (yearsWorked * 1000);
        return salary;
    }
}
