package polytech.projectsem2.productecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.projectsem2.productecommerce.model.Product;
import polytech.projectsem2.productecommerce.service.CategoryService;
import polytech.projectsem2.productecommerce.service.ProductService;



@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @PostMapping("{categoryId}")
    public ResponseEntity<?> saveProduct(@PathVariable Long categoryId,@RequestBody Product product)
    {var val=categoryService.findByCategoryId(categoryId);
        if(val.isPresent()){
            product.setCategory( val.get());
            return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
        }
        else return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.BAD_REQUEST);

        
    }
    
    @DeleteMapping("{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
    {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts(Model model)
     {
        return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);
     }
     @GetMapping("{productId}")
     public ResponseEntity<?> getProductById(@PathVariable Long productId)
      {
         return new ResponseEntity<>(productService.findByProductId(productId), HttpStatus.OK);
      }
     
    
}
