package polytech.projectsem2.productecommerce.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.projectsem2.productecommerce.model.Customer;
import polytech.projectsem2.productecommerce.repository.CustomerRepository;





@Service
public class CustomerServiceImp implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
   
   

    @Override
    public Customer saveCustomer(Customer customer)
    {
       
        return customerRepository.save(customer);

    }

    @Override
    public void deleteCustomer(Long id ) 
    {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findByCustomerById(Long id) {
        
        return customerRepository.findById(id);
    }

   
    
}
   
