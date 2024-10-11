public class bai14 {
    public static void main(String[] args) {
        Employee employee = new Employee(996, "Phan Quốc", "Huy", 3600 );
        employee.setSalary(15);
        System.out.println("Id is: " + employee.getId());
        System.out.println("Firstname is: " + employee.getFirstName());
        System.out.println("Lastname is: " + employee.getLastName());
        System.out.println("Salary is: " + employee.getSalary());
        System.out.println("Full name is: " + employee.getName());
        System.out.println("Annual salary is: " + employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(20));
        System.out.println(employee);
    }
}
