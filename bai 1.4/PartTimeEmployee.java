public class PartTimeEmployee extends Employee {
    protected int hourlyRate;
     PartTimeEmployee(int id, String name, int age, int salary, int hourlyRate) {
      super(id, name, age, salary);
      this.hourlyRate = hourlyRate;
    }
    public String displayInfo( int hourlyRate){
        return "ID: " + id + " Name: " + name + " Age: " + age + " HourlyRate: " + hourlyRate;
    }
}