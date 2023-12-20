package polytech.project.productecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import polytech.project.productecommerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
