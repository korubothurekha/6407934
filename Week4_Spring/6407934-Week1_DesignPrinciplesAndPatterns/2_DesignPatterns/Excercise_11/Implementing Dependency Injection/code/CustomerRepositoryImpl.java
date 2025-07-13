//CustomerRepositoryImpl.java – Concrete Repository

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> database = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        database.put("C101", new Customer("C101", "Rekha Korubothu"));
        database.put("C102", new Customer("C102", "Priya Sharma"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return database.get(id);
    }
}
