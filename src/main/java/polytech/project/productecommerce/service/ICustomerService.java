package polytech.project.productecommerce.service;

import java.util.List;
import java.util.Optional;

import polytech.project.productecommerce.model.Customer;

public interface ICustomerService {
    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    public List<Customer> findAllCustomers();

    Optional<Customer> findByCustomerById(Long id);

}
