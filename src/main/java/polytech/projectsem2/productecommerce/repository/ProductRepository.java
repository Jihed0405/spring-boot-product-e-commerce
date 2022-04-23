package polytech.projectsem2.productecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import polytech.projectsem2.productecommerce.model.Product;



public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
