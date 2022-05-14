package polytech.projectsem2.productecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import polytech.projectsem2.productecommerce.model.Purchase;
import polytech.projectsem2.productecommerce.repository.projection.PurchaseItem;



public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
    
    @Query("select "+
    "d.name as name, d.category as type, p.price as price, p.color as color, p.purchaseTime as purchaseTime "+
    "from Purchase p left join Product d on d.id = p.productId "+
    "where p.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
