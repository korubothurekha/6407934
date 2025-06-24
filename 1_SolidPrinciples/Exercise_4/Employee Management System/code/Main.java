public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Rekha", "Developer", 60000));
        manager.addEmployee(new Employee(102, "Aman", "Designer", 50000));
        manager.addEmployee(new Employee(103, "Priya", "Manager", 80000));

        System.out.println("Here is the list of all Employees:");
        manager.displayEmployees();

        System.out.println("\nSearching for Employee with ID 102:");
        System.out.println(manager.searchEmployee(102));

        System.out.println("\nDeleting Employee data with ID 102:");
        manager.deleteEmployee(102);

        System.out.println("\nAfter Deletion , here is the new list:");
        manager.displayEmployees();
    }
}
