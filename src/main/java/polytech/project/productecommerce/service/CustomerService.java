package polytech.project.productecommerce.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.project.productecommerce.model.Customer;
import polytech.project.productecommerce.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);

    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findByCustomerById(Long id) {

        return customerRepository.findById(id);
    }

}
