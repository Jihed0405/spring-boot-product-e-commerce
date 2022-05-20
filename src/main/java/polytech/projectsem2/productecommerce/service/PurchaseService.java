package polytech.projectsem2.productecommerce.service;

import java.util.List;

import polytech.projectsem2.productecommerce.model.Purchase;
import polytech.projectsem2.productecommerce.repository.projection.PurchaseItem;


public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);
    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
    
}
