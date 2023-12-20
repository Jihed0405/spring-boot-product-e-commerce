package polytech.project.productecommerce.controller;

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

import polytech.project.productecommerce.model.ProducType;
import polytech.project.productecommerce.service.ICategoryService;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping
    public ResponseEntity<?> saveCategory(@RequestBody ProducType category) {
        return new ResponseEntity<>(categoryService.saveCategory(category), HttpStatus.CREATED);
    }

    @DeleteMapping("{categoryId}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long categoryId) {
        categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCategories() {
        return new ResponseEntity<>(categoryService.findAllCategories(), HttpStatus.OK);
    }

    @GetMapping("{categoryId}")
    public ResponseEntity<?> getCategoryById(@PathVariable Long categoryId) {
        return new ResponseEntity<>(categoryService.findByCategoryId(categoryId), HttpStatus.OK);
    }
}
