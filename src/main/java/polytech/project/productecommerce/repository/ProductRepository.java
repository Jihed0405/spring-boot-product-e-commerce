package polytech.project.productecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import polytech.project.productecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
