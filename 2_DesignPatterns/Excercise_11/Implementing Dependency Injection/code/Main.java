//Main.java – Test Dependency Injection

public class Main {
    public static void main(String[] args) {
        // Dependency: repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Injecting dependency into service
        CustomerService service = new CustomerService(repository);

        // Test
        service.getCustomerInfo("C101");
        service.getCustomerInfo("C103"); // Non-existent
    }
}
