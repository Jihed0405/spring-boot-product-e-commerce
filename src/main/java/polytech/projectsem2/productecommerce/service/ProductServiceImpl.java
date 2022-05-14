package polytech.projectsem2.productecommerce.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import polytech.projectsem2.productecommerce.model.Product;
import polytech.projectsem2.productecommerce.repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product)
    {
       
        product.setCreatTime(LocalDateTime.now());
        return productRepository.save(product);

    }

    @Override
    public void deleteProduct(Long id ) 
    {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return productRepository.findAll();
    }
}
   
