package polytech.project.productecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import polytech.project.productecommerce.model.ProducType;

public interface CategoriesRepository extends JpaRepository<ProducType, Long> {

}
