package polytech.project.productecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.project.productecommerce.model.ProducType;
import polytech.project.productecommerce.repository.CategoriesRepository;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public ProducType saveCategory(ProducType category) {

        return categoriesRepository.save(category);

    }

    @Override
    public void deleteCategory(Long id) {
        categoriesRepository.deleteById(id);
    }

    @Override
    public List<ProducType> findAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Optional<ProducType> findByCategoryId(Long id) {

        return categoriesRepository.findById(id);
    }

}
