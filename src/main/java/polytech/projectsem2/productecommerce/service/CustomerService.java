package polytech.projectsem2.productecommerce.service;
import java.util.List;
import java.util.Optional;
import polytech.projectsem2.productecommerce.model.Customer;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    public List<Customer> findAllCustomers();
    Optional<Customer> findByCustomerById(Long id);
 
}
