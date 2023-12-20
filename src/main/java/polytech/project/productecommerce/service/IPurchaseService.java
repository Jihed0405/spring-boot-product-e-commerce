package polytech.project.productecommerce.service;

import java.util.List;

import polytech.project.productecommerce.model.Purchase;
import polytech.project.productecommerce.repository.projection.PurchaseItem;

public interface IPurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);

}
