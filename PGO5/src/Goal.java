public class Goal {
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonus = bonus;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getBonus() {
        return bonus;
    }
}
