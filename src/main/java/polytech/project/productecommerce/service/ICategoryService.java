package polytech.project.productecommerce.service;

import java.util.List;
import java.util.Optional;

import polytech.project.productecommerce.model.ProducType;

public interface ICategoryService {
    ProducType saveCategory(ProducType category);

    void deleteCategory(Long id);

    public List<ProducType> findAllCategories();

    Optional<ProducType> findByCategoryId(Long id);

}
