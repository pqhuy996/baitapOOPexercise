public class bai14 {
    public static void main(String[] args) {
        Employee employee = new Employee(16,"Phan Quoc Huy",18,3600 );
        System.out.println(employee.displayInfo());
        FulltimeEmployee fte = new FulltimeEmployee(17,"Vo Van Nhan",20,2500, 100);
        System.out.println(fte.displayInfo(100));
        PartTimeEmployee pte = new PartTimeEmployee(18, "Tran Le Anh Quoc",18,2000,36);
        System.out.println(pte.displayInfo(36));
    }
}
