package polytech.projectsem2.productecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import polytech.projectsem2.productecommerce.model.ProducType;



public interface  CategoriesRepository extends JpaRepository<ProducType,Long>{
   
}
