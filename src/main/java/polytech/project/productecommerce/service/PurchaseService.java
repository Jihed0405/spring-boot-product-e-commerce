package polytech.project.productecommerce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.project.productecommerce.model.Purchase;
import polytech.project.productecommerce.repository.PurchaseRepository;
import polytech.project.productecommerce.repository.projection.PurchaseItem;

@Service
public class PurchaseService implements IPurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);

    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }

}
