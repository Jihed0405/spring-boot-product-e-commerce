package polytech.project.productecommerce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.project.productecommerce.model.Product;
import polytech.project.productecommerce.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {

        product.setCreatTime(LocalDateTime.now());
        return productRepository.save(product);

    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findByProductId(Long id) {

        return productRepository.findById(id);
    }
}
