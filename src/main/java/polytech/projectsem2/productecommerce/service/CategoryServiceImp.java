package polytech.projectsem2.productecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.projectsem2.productecommerce.model.ProducType;
import polytech.projectsem2.productecommerce.repository.CategoriesRepository;




@Service
public class CategoryServiceImp implements CategoryService {
    
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public ProducType saveCategory(ProducType category)
    {
       
        return categoriesRepository.save(category);

    }

    @Override
    public void deleteCategory(Long id ) 
    {
        categoriesRepository.deleteById(id);
    }

    @Override
    public List<ProducType> findAllCategories()
    {
        return categoriesRepository.findAll();
    }
}
   
