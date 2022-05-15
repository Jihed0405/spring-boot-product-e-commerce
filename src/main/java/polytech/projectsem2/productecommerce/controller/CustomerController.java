package polytech.projectsem2.productecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.projectsem2.productecommerce.model.Customer;
import polytech.projectsem2.productecommerce.service.CustomerService;




@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer)
    {
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
    
    @DeleteMapping("{customerId}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long customerId)
    {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findAllCustomers()
     {
        return new ResponseEntity<>(customerService.findAllCustomers(), HttpStatus.OK);
     }
    
}
