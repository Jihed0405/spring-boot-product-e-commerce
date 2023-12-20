package polytech.project.productecommerce.service;

import java.util.List;

import java.util.Optional;

import polytech.project.productecommerce.model.Product;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    public List<Product> findAllProducts();

    Optional<Product> findByProductId(Long id);

}
