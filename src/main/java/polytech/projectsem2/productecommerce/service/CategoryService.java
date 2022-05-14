package polytech.projectsem2.productecommerce.service;

import java.util.List;


import polytech.projectsem2.productecommerce.model.ProducType;

public interface CategoryService {
    ProducType saveCategory(ProducType category);
    void deleteCategory(Long id);
    public List<ProducType> findAllCategories();
 
}
