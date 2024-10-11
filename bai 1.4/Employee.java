public class Employee {
    protected int id;
    protected String name;
    protected int age;
    protected int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String displayInfo() {
        return "ID: " + id + " Name: " + name + " Age: " + age + " Salary: " + salary;
    }
}