public class FulltimeEmployee extends Employee {
    protected int bonus;
    FulltimeEmployee(int id, String name, int age, int salary, int bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }
    public String displayInfo( int bonus) {
        return "ID: " + id + " Name: " + name + " Age: " + age + " Bonus: " + bonus;
    }
}
