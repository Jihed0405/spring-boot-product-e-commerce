package polytech.projectsem2.productecommerce.service;

import java.util.List;

import java.util.Optional;
import polytech.projectsem2.productecommerce.model.Product;

public interface ProductService {
    Product saveProduct(Product product);
    void deleteProduct(Long id);
    public List<Product> findAllProducts();
    Optional<Product> findByProductId(Long id);
 
}
