package polytech.projectsem2.productecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import polytech.projectsem2.productecommerce.model.Customer;





public interface  CustomerRepository extends JpaRepository<Customer,Long>{
   
}
